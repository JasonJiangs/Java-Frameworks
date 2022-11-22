package com.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/20 15:30 15 30
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> empList;

}