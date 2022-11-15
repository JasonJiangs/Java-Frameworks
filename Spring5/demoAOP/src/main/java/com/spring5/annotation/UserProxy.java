package com.spring5.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: Jason
 * @Date: 2022/11/13 1:47 01 47
 */

// reinforced class
@Component
@Aspect  // generate proxy instance
@Order(2)
public class UserProxy {

    // get same aspect
    @Pointcut(value = "execution(* com.spring5.annotation.User.add(..))")
    public void pointCutAdd() {
    }

    @Before(value = "pointCutAdd()")
    public void before() {  // before notification
        System.out.println("Before......");
    }

    @AfterReturning(value = "pointCutAdd()")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    @After(value = "pointCutAdd()")
    public void after() {
        System.out.println("after.........");
    }

    @AfterThrowing(value = "pointCutAdd()")
    public void afterThrowing() {
        System.out.println("after throwing.........");
    }

    @Around(value = "pointCutAdd()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before around .........");
        // execute add(..)
        proceedingJoinPoint.proceed();
        System.out.println("After around .........");
    }

}