package com.warape.dependency.injection;

import com.warape.dependency.injection.domain.UserHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * 基于XML资源的依赖  Constructor注入
 *
 * @author wanmingyu
 * @create 2020/7/23 1:46 下午
 */
public class XmlDependencyConstructorInjection {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(beanFactory);
        String xml = "classpath:/META-INF/dependency-constructor-injection.xml";
        definitionReader.loadBeanDefinitions(xml);

        UserHolder userHolder = beanFactory.getBean(UserHolder.class);
        System.out.println(userHolder);
    }

}
