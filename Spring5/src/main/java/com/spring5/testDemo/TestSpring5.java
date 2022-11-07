package com.spring5.testDemo;
import com.spring5.Book;
import com.spring5.Orders;
import com.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/6 19:52 19 52
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        /**
         * BeanFactory VS ApplicationContext:
         *  Lazy Loading -- Loading at the first step
         */
        // load bean.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        // get deployment object, from id
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
    }

    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders order = context.getBean("order", Orders.class);

        System.out.println(order);
    }
}