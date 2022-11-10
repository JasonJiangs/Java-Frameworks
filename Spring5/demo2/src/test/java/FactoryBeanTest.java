import com.spring5.FactoryBean.MyBean;
import com.spring5.collectiontype.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/9 23:19 23 19
 */
public class FactoryBeanTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("FactoryBean/bean1.xml");
        Course myBean = context.getBean("MyBean", Course.class);
        System.out.println(myBean);
    }
}