package com.spring.jdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: Jason
 * @Date: 2022/11/17 14:38 14 38
 */

@Repository
public class AccountImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void transfer() {
        String sql = "update user_account set money=money-? where id=?";
        jdbcTemplate.update(sql, 100, 1);
    }

    @Override
    public void receive() {
        String sql = "update user_account set money=money+? where id=?";
        jdbcTemplate.update(sql, 100, 2);
    }
}