package cn.sexycode.spring.study.chapter5;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemoApplication {
    public static void main(String[] args) {
        /*DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("AopDemo.xml");
        beanFactory.getBean(BusinessService.class).sayHello();*/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AopDemo.xml");
        applicationContext.getBean(IBusinessService.class).sayHello();
    }
}
