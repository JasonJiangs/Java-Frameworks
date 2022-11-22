package com.mybatis;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.pojo.EmpExample;
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
 * @Date: 2022/11/22 2:37 02 37
 */
public class MBGTest {
    @Test
    public void testMBG() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            /**
             * Select by example (condition), null ==> select *
             */
            List<Emp> emps = mapper.selectByExample(null);
            System.out.println("SelectByExample ===== " + emps);

            /**
             * Select by example (condition)
             */
            EmpExample empExample = new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("Jason");
            List<Emp> emps1 = mapper.selectByExample(empExample);
            System.out.println("SelectByExample Condition ======= "+emps1);

            /**
             * null value problem
             */
            mapper.updateByPrimaryKeySelective(new Emp(1, "Admin", 21, "f", "sadishu32", 2));
            mapper.updateByPrimaryKey(new Emp(1, "Admin", 21, "f", "sadishu32", 2));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}