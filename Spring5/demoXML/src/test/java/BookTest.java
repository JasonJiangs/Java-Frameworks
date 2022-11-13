import com.spring5.autowire.Emp;
import com.spring5.collectiontype.Book;
import com.spring5.bean.book;
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

    /**
     *
     */
    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        book book = context.getBean("book", book.class);
        System.out.println("Step 4: Output instance" + book);

        // destroy bean instance
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testOld() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Object emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}