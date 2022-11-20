package com.mybatis.test;

import com.mybatis.mapper.ParameterMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/18 16:53 16 53
 */
public class TestParameterMapper {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
    }


    @Test
    public void testJDBC() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement preparedStatement = connection.prepareStatement("Select * from t_user where username = ?");
        preparedStatement.setString(1, "username");
        preparedStatement.executeQuery();
        preparedStatement.close();
    }

    /**
     * ${}: String concatenation
     * #{}: placeholder assignment
     */
    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User jason = mapper.getUserByUsername("jason");
        System.out.println(jason);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("jason", "123123");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null, "Tom", "123123", 21, "Male", "tom@gamil.com");
        try {
            System.out.println(mapper.insertUser(user));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Test Exception");
        }
    }

    @Test
    public void testCheckLoginParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        // TODO source code
        User user = mapper.checkLoginByParam("Jason", "123123");
        System.out.println(user);

    }

}