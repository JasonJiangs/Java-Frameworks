package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/20 15:31 15 31
 */
public interface EmpMapper {

    List<Emp> getAllEmp();

    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * Query Emp Info by steps 1
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);


    /**
     * Query Emp List by steps 2
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);

}
