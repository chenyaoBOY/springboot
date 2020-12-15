package org.study.ssm.druid.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/12/10 11:07
 * @description
 */
@Component
public class DoSomethingAfterSpringStart implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("系统停止 do something");
            }
        });
    }
}
