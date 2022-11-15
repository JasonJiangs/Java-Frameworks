package com.spring5.fullconfig;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Jason
 * @Date: 2022/11/15 1:06 01 06
 */

@Configuration
@ComponentScan(basePackages = {"com.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Aspect
public class ConfigAop {



}