package com.mybatis.mapper;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/8 13:23 13 23
 */
public interface UserMapper {

    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUsers();

}
