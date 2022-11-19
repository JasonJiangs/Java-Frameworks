package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: Jason
 * @Date: 2022/11/18 16:45 16 45
 */
public interface ParameterMapper {

    Integer insertUser(User user);

    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String username, String password);

    User checkLoginByParam(@Param("un") String username, @Param("pwd") String password);

    User checkLoginByMap(Map<String, Object> map);
}
