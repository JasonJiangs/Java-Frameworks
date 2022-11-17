package com.spring.jdbcTemplate.dao;

import com.spring.jdbcTemplate.entity.User;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/16 22:08 22 08
 */
public interface UserDao {

    void add(User user);

    void delete(int userId);

    void update(User user);

    int selectCount();

    User findUser(int userId);

    List<User> findUserList();

    void batchAdd(List<Object[]> batchArgs);
}