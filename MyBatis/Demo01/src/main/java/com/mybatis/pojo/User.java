package com.mybatis.pojo;

import lombok.Data;

/**
 * @Author: Jason
 * @Date: 2022/11/8 13:19 13 19
 */

@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;
}