package org.study.vuelearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VueLearnApplication {

    @RequestMapping("/vue")
    public boolean vueRequest(String message){
        System.out.println(message);
        if(message==null){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        SpringApplication.run(VueLearnApplication.class, args);
    }

}
