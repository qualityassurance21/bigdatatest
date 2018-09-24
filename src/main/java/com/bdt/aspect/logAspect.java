package com.bdt.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class logAspect {
    private final static Logger logger = LoggerFactory.getLogger(logAspect.class);

//    @Pointcut("execution(public * com.bdt.controller.ArticleController.*(..))")
    @Pointcut("execution(public * com.bdt.controller.OperatorController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("After");
    }


}
