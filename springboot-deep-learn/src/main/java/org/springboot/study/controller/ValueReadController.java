package org.springboot.study.controller;

import org.bean.path.MyAutoConfigBeanService;
import org.springboot.study.config.value.Book;
import org.springboot.study.config.value.CpxLocation;
import org.springboot.study.service.AppInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;


/**
 * Hello world!
 */
//@SpringBootApplication
//@RestController
public class ValueReadController implements AppInterface {

    @Value("${app.name:yaoyao}")
    String name;

    @Autowired
    Book book;
    @Autowired
    CpxLocation cpx;
    @Autowired
    MyAutoConfigBeanService service;

    @RequestMapping("/")
    String home(){
        return "msg="+service.getMsg()+ " \n name="+name
                + " \n book.name="+book.getName() + "\n book.author= "+book.getAuthor()+
                "\n cpx="+cpx.getLocation();
    }
    @RequestMapping("/home")
    String hello(){
        return name;
    }
    @DeleteMapping(value = "/delete",consumes = "application/json")
    public String delete(@RequestBody String json){
        return json;
    }
    @PutMapping(value = "/post",consumes = "application/json")
    public String post(@RequestBody  String json){
        return json;
    }


    public static void main(String[] args) {
        SpringApplication.run(ValueReadController.class,args);
    }

    @Override
    public String queryInfo() {
        return "queryInfo";
    }
}
