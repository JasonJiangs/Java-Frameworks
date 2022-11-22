import com.mybatis.mapper.DynamicSQLMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/21 23:32 23 32
 */
public class DynamicSQLMapperTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "", null, "m", "sjiang23");
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        System.out.println(empByCondition);
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByChoose = mapper.getEmpByChoose(new Emp(null, "", null, "", ""));
        System.out.println(empByChoose);
    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{5, 6, 7});
        System.out.println(i);
    }

    @Test
    public void testInsertMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a", 21, "m", "sawdaw");
        Emp emp2 = new Emp(null, "b", 22, "m", "sawdaw");
        Emp emp3 = new Emp(null, "d", 24, "m", "sawdaw");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        int i = mapper.insertMoreByList(emps);
        System.out.println(i);
    }

}