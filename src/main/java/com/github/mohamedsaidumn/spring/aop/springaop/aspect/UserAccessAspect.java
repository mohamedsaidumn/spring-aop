package com.github.mohamedsaidumn.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would want to intercept is called pointcut it structure
    //Shown below.
    //execution(* PACKAGE.*.*(..)) //return type . PACKAGE . class . method
    //Weaving & Weaver

    @Before("com.github.mohamedsaidumn.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void before(JoinPoint joinPoint){
        //Advice
        logger.info(" Check for user access ");
        logger.info("intercepted method call - {}", joinPoint);
    }
}
