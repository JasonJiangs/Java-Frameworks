package com.spring.jdbcTemplate.entity;

import lombok.*;

/**
 * @Author: Jason
 * @Date: 2022/11/16 23:04 23 04
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private int userId;
    private String username;
    private String status;
}



