import com.mybatis.mapper.CacheMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author: Jason
 * @Date: 2022/11/22 1:11 01 11
 */
public class CacheMapperTest {

    @Test
    public void testCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empByEid = mapper.getEmpByEid(1);
        System.out.println(empByEid);
    }


}