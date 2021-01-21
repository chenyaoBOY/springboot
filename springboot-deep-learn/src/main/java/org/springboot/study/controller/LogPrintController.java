package org.springboot.study.controller;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/log/{level}")
    public String changeLogLevel(@PathVariable("level") String level){
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.getLogger("org.springboot.study").setLevel(Level.valueOf(level));
        return "ok";
    }

}
