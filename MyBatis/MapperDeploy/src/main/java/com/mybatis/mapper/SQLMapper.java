package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/20 11:58 11 58
 */
public interface SQLMapper {
    /**
     * Fuzzy Query
     */
    List<User> getUserByLike(@Param("username") String username);

    Integer batchDelete(@Param("ids") String ids);

}
