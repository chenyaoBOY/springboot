package org.spring.study.baseconfig.beanInitAndDestroy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoBean {

    public void init(){
        log.info("demoBean初始化开始");
    }
    public void hello(){
        log.info("hello world! ");
    }
    public void destroy(){
        log.info("demoBean结束生命周期");
    }
}
