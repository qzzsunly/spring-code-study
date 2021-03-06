package cn.sexycode.spring.study.chapter4;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Hello world!
 *
 * @author qzz
 */
public class App {
    public static void main(String[] args) {
        // 1. 初始化一个bean 工厂
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 2. 初始化XmlBeanDefinitionReader,负责从xml文件中读取bean定义
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        // 3. 加载bean 定义的入口方法
        reader.loadBeanDefinitions("app.xml");
        factory.addBeanPostProcessor(factory.getBean("awareBeanPostProcessor", InstantiationAwareBeanPostProcessor.class));
        System.out.println(factory.getBean(Student.class));
    }
}
