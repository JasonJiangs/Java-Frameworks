package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;

/**
 * @Author: Jason
 * @Date: 2022/11/7 12:31 12 31
 */
public class UserService {

    // init UserDao variable with set(), in this case, realize set() injection
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("user service add");
        userDao.update();

//        // create UserDao
//        UserDaoImpl userDao = new UserDaoImpl();
//        userDao.update();


    }
}