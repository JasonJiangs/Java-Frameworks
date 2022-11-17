package com.spring.jdbcTemplate.dao;

import com.spring.jdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/16 22:08 22 08
 */

@Repository
public class UserImpl implements UserDao {

    // inject jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sqlAdd = "insert into t_user values(?,?,?)";

        int update = jdbcTemplate.update(sqlAdd, user.getUserId(), user.getUsername(), user.getStatus());
        System.out.println(update);
    }

    @Override
    public void delete(int userId) {
        String sqlDelete = "delete from t_user where user_id = ?";

        int update = jdbcTemplate.update(sqlDelete, userId);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sqlUpdate = "update t_user set username=?, status=? where user_id = ?";
        Object[] args = {user.getUsername(), user.getStatus(), user.getUserId()};
        int update = jdbcTemplate.update(sqlUpdate, args);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sqlQuery = "select count(*) from t_user";
        Integer integer = jdbcTemplate.queryForObject(sqlQuery, Integer.class);
        return integer;
    }

    @Override
    public User findUser(int userId) {
        String sqlFind = "select * from t_user where user_id = ?";
        User user = jdbcTemplate.queryForObject(sqlFind, new BeanPropertyRowMapper<User>(User.class), userId);
        return user;
    }

    @Override
    public List<User> findUserList() {
        String sqlFindAll = "select * from t_user";
        List<User> query = jdbcTemplate.query(sqlFindAll, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sqlBatchAdd = "insert into t_user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sqlBatchAdd, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}