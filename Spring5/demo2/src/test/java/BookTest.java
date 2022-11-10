import com.spring5.collectiontype.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/9 23:09 23 09
 */
public class BookTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}