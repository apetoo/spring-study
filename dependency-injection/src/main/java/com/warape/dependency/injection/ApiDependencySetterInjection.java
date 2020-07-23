package com.warape.dependency.injection;

import com.warape.dependency.injection.domain.UserHolder;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于API资源的依赖  setter方法注入
 *
 * @author wanmingyu
 * @create 2020/7/23 1:46 下午
 */
public class ApiDependencySetterInjection {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.registerBeanDefinition("userHolder",createUserHolderBean());
        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(applicationContext);
        String xml = "classpath:/META-INF/dependency-lookup.xml";
        definitionReader.loadBeanDefinitions(xml);

        applicationContext.refresh();

        UserHolder userHolder = applicationContext.getBean(UserHolder.class);
        System.out.println(userHolder);

        applicationContext.close();
    }


    public static BeanDefinition createUserHolderBean(){
        return BeanDefinitionBuilder
                .genericBeanDefinition(UserHolder.class)
                .addPropertyReference("user","superUser")
                .getBeanDefinition();
    }

}
