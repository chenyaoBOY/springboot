package org.spring.study.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Import;

/**
 * @author chenyao
 * @date 2021/2/8 16:40
 * @description
 */
@SpringBootApplication
@Import(ImportRegistryDemo.class)
public class DemoApp implements ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Object myBean = applicationContext.getBean("myBean");
    }
}
