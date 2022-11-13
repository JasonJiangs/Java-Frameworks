package com.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: Jason
 * @Date: 2022/11/12 21:29 21 29
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("User Dao Impl Adding...");
    }

}