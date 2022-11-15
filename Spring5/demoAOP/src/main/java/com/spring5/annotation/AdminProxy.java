package com.spring5.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: Jason
 * @Date: 2022/11/15 0:37 00 37
 */
@Component
@Aspect
@Order(1)
public class AdminProxy {
    // get same aspect
    @Pointcut(value = "execution(* com.spring5.annotation.User.add(..))")
    public void pointCutAdd() {
    }

    @Before(value = "pointCutAdd()")
    public void afterReturning() {
        System.out.println("Person before.........");
    }
}