import com.spring.jdbcTemplate.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/17 14:21 14 21
 */
public class TestTransaction {

    @Test
    public void testTransfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTransaction.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferUpdate();
    }
}