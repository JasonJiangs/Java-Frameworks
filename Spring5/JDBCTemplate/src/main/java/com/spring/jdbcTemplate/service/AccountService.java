package com.spring.jdbcTemplate.service;

import com.spring.jdbcTemplate.dao.AccountDao;
import com.spring.jdbcTemplate.dao.AccountImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jason
 * @Date: 2022/11/17 14:38 14 38
 */

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transferUpdate() {

        try{

            accountDao.transfer();
            accountDao.receive();

        } catch (Exception e) {



        }
    }



}