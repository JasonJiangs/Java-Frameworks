package com.spring5.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author: Jason
 * @Date: 2022/11/13 1:47 01 47
 */

@Component
public class User {


    public void add() {
        System.out.println("add.........");
    }

}