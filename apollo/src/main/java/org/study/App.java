package org.study;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App
{

    @Value("${timeout:null}")
    private String timeout;

//    @Autowired
//    ConfigInfo configInfo;
//
//    @GetMapping("/")
//    public String home(){
//        return "ok"+timeout+configInfo.getName();
//    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
