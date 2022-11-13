package com.spring5.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jason
 * @Date: 2022/11/12 22:08 22 08
 */


// <context:component-scan base-package="com.spring5"></context:component-scan>
@Configuration  // as configuration class to replace .xml file
@ComponentScan(basePackages = {"com.spring5"})
public class SpringConfig {
}