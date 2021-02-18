package org.spring.study.demo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author chenyao
 * @date 2021/2/8 16:25
 * @description
 */
public class FactoryBeanDemo implements FactoryBean {

    private String name;

    @Override
    public Object getObject() throws Exception {
        System.out.println(this.toString());
        return name;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
