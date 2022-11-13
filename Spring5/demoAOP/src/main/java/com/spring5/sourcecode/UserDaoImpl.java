package com.spring5.sourcecode;

/**
 * @Author: Jason
 * @Date: 2022/11/12 23:08 23 08
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}