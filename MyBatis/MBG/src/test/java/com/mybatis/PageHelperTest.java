package com.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/22 2:59 02 59
 */
public class PageHelperTest {
    @Test
    public void testPageHelper() {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        /**
         *
         */
        PageHelper.startPage(1, 1);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> page = new PageInfo<>(emps, 4);
        System.out.println(page.getNavigateLastPage());
//        emps.forEach(emp -> System.out.println(emp));
        try {
            sqlSession.close();
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}