package com.github.mohamedsaidumn.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.github.mohamedsaidumn.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.github.mohamedsaidumn.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution(){}
}