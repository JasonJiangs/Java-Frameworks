package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/20 15:31 15 31
 */
public interface DeptMapper {

    /**
     * Query Emp Info by steps 2
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    List<Emp> getDeptAndEmp(@Param("did") Integer did);

    /**
     * Query List Emp by Steps 1
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);


}
