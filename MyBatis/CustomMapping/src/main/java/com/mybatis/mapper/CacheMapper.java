package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jason
 * @Date: 2022/11/22 1:09 01 09
 */
public interface CacheMapper {

    Emp getEmpByEid(@Param("eid") Integer eid);

}
