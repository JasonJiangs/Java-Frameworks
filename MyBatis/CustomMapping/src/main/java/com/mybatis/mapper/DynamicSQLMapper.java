package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/21 22:15 22 15
 */
public interface DynamicSQLMapper {

    /**
     * Query by multiple variables
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    int deleteMoreByArray(@Param("eidList") Integer[] eidList);

}
