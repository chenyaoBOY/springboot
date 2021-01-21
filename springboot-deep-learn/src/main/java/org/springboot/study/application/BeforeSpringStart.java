package org.springboot.study.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/7/9 16:24
 * @description 在spring容器启动完成后 方法退出前 加载一些事情
 * If you need to run some specific code once the SpringApplication has started,
 * you can implement the ApplicationRunner or CommandLineRunner interfaces.
 *
 * 如果有多个ApplicationRunner实现类 则可以使用 @Order注解 或者 实现Ordered接口
 */
@Component
@Slf4j
public class BeforeSpringStart implements ApplicationRunner, Ordered {
    @Value("${database.name}")
    private String name;
    @Value("${database.version}")
    private String version;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("BeforeSpringStart 是否在main方法结束前调用 application-mysql.yml配置读取为："+name+version);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
