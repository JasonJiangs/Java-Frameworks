package com.spring.jdbcTemplate.service;

import com.spring.jdbcTemplate.dao.AccountDao;
import com.spring.jdbcTemplate.dao.AccountImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Jason
 * @Date: 2022/11/17 14:38 14 38
 */

@Service
@Transactional(timeout = -1, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transferUpdate() {

            accountDao.transfer();
//            int a= 10/0;
            accountDao.receive();

    }



}