package com.mybatis.test;

import com.mybatis.mapper.ParameterMapper;
import com.mybatis.mapper.SQLMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/20 12:01 12 01
 */
public class SQLMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userByLike = mapper.getUserByLike("a");
        System.out.println(userByLike);
    }


    @Test
    public void testBatchDelete() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int i = mapper.batchDelete("7,8,9");
        System.out.println(i);
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userByTableName = mapper.getUserByTableName("t_user");
        System.out.println(userByTableName);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "Jimmy", "123123", 21, "male", "jimmy423@gmai.com");
        Integer integer = mapper.insertUser(user);
        System.out.println(integer);
        // assign auto generated key (id)
        System.out.println(user);
    }
}