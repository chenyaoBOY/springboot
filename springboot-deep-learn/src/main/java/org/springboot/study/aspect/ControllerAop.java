package org.springboot.study.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.spring.study.aop.Action;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author chenyao
 * @date 2020/12/15 13:22
 * @description
 */
@Aspect
@Component
public class ControllerAop {

    @Before("execution(* org.springboot.study.controller.*.*(..))")
    public void after(JoinPoint point){
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Object[] args = point.getArgs();
        System.out.println("controller入参:method="+methodSignature.getMethod().getName()+" param="+JSON.toJSONString(args));
    }
}
