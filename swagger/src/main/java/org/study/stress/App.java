package org.study.stress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chenyao
 * @date 2020/9/25 16:24
 * @description
 */
@SpringBootApplication
@RestController
public class App {

    private AtomicInteger count = new AtomicInteger(1);

    @GetMapping("/home")
    public String home() throws InterruptedException {
        System.out.println("第"+count.getAndIncrement()+"次请求 time="+System.currentTimeMillis()/1000);
        Thread.sleep(10*1000);
//        Thread.sleep((long) (Math.random()*500));
        return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
