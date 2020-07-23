package com.warape.dependency.injection;

import com.warape.dependency.injection.domain.UserHolder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 自动绑定
 *
 * @author wanmingyu
 * @create 2020/7/23 1:46 下午
 */
public class AutoWiringByNameDependencySetterInjection {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(applicationContext);
        String xml = "classpath:/META-INF/autowiring-dependency-setter-injection.xml";
        definitionReader.loadBeanDefinitions(xml);

        applicationContext.refresh();

        UserHolder userHolder = applicationContext.getBean(UserHolder.class);
        System.out.println(userHolder);

        applicationContext.close();
    }


}
