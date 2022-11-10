import com.spring5.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/9 22:42 22 42
 */
public class StudentTest {
    @Test
    public void testStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

    }
}