package org.springboot.study.controller;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.study.entity.UserJapan;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyao
 * @date 2021/1/21 15:30
 * @description
 */
@RestController
public class LogPrintController {
    Logger logger = LoggerFactory.getLogger(LogPrintController.class);


    @GetMapping("/debug")
    public String debugPrint() {
        logger.debug("print debug");
        logger.info("print info");
        logger.warn("print warn");
        logger.error("print error");
        return "ok";
    }
    @GetMapping("/debugParam")
    public String debugParam(@RequestParam String name,@RequestParam Integer age) {
        logger.info("name={}",name);
        logger.info("age={}",age);
        return "ok";
    }
    @PostMapping("/smart/post")
    public UserJapan smartPost(@RequestBody UserJapan user) {
        logger.info("name={}",user.getName());
//        logger.info("age={}",age);
        return new UserJapan(user.getName()+" - 小泽女郎");
    }

    /**
     * 这种用法不对 一个http只能有一个Body
     * @param user
     * @param age
     * @return
     */
    @PostMapping("/smart/post2")
    public UserJapan smartPost(@RequestBody UserJapan user,@RequestBody Integer age) {
        logger.info("name={}",user.getName());
        logger.info("age={}",age);
        return new UserJapan(user.getName()+" - 小泽女郎");
    }





    @GetMapping("/log/{level}")
    public String changeLogLevel(@PathVariable("level") String level){
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getLogger("org.springboot.study").setLevel(Level.valueOf(level));
        return "ok";
    }

}
