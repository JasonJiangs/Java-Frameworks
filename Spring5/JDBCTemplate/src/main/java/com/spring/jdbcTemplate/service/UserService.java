package com.spring.jdbcTemplate.service;

import com.spring.jdbcTemplate.dao.UserDao;
import com.spring.jdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/16 22:08 22 08
 */

@Service
public class UserService {

    // inject DAO
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }

    public void deleteUser(int userId) {
        userDao.delete(userId);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public int countTotal() {
        return userDao.selectCount();
    }

    public User findOne(int userId) {
        return userDao.findUser(userId);
    }

    public List<User> findUserList() {
        return userDao.findUserList();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        userDao.batchAdd(batchArgs);
    }

}