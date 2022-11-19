package com.mybatis.test;

import com.mybatis.mapper.ParameterMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        PreparedStatement preparedStatement = connection.prepareStatement("Select * from t_user where username = ");
        preparedStatement.executeQuery();
        preparedStatement.close();
    }
}