package com.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.jdbc.Null;

/**
 * @Author: Jason
 * @Date: 2022/11/8 13:19 13 19
 */

@Data
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;
}