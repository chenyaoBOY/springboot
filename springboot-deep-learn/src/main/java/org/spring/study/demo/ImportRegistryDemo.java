package org.spring.study.demo;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author chenyao
 * @date 2021/2/8 16:39
 * @description
 */
public class ImportRegistryDemo implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(FactoryBeanDemo.class);
        builder.addPropertyValue("name","yaoyao");
        registry.registerBeanDefinition("myBean",builder.getBeanDefinition());
    }
}
