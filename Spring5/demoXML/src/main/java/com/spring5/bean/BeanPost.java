package com.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: Jason
 * @Date: 2022/11/12 11:58 11 58
 */
public class BeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post Process before Initialization");
        return bean;
//        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post Process after Initialization");
        return bean;
//        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}