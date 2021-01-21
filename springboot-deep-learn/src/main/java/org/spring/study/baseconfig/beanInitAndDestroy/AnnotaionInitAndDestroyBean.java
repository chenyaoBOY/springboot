package org.spring.study.baseconfig.beanInitAndDestroy;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class AnnotaionInitAndDestroyBean {

    @PostConstruct
    public void init(){
        log.info("AnnotaionInitAndDestroyBean初始化开始");
    }
    public void hello(){
        log.info("hello world! ");
    }

    @PreDestroy
    public void destroy(){
        log.info("AnnotaionInitAndDestroyBean结束生命周期");
    }
}
