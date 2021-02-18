package org.spring.study.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyao
 * @date 2021/2/8 16:27
 * @description
 */
@Configuration
public class AnnotationApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationApp.class);



        applicationContext.registerBeanDefinition("myBean",getBeanDefinition("chenyao"));
        applicationContext.registerBeanDefinition("myBean2",getBeanDefinition("chenyao2"));
        applicationContext.registerBeanDefinition("myBean3",getBeanDefinition("chenyao3"));


        applicationContext.refresh();

        Object myBean = applicationContext.getBean("myBean");
        Object myBean2 = applicationContext.getBean("myBean2");
        Object myBean3 = applicationContext.getBean("myBean3");


    }

    public static BeanDefinition getBeanDefinition(String name){
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(FactoryBeanDemo.class);
        builder.addPropertyValue("name",name);
        return builder.getBeanDefinition();
    }
}
