package com.spring5.service;

import com.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: Jason
 * @Date: 2022/11/12 14:05 14 05
 */

//@Component(value = "userService")  // <bean id="" class=""/>
    // Controller / Component / Repository
//@Service(value = "userService")  // <bean id="" class=""/>

@Service
public class UserService {

    // define dao property
    @Autowired  // inject by type
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "Jason")
    private String name;

    public void add() {
        System.out.println("Service adding ...");
        userDao.add();
        System.out.println(name);
    }


}