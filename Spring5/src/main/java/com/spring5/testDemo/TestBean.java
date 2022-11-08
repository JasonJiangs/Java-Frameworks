package com.spring5.testDemo;

import com.spring5.dao.UserDaoImpl;
import com.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/7 13:03 13 03
 */
public class TestBean {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService useService = context.getBean("useService", UserService.class);
        useService.add();
    }
}