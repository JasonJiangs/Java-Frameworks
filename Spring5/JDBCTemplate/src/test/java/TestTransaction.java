import com.spring.jdbcTemplate.Config.TxConfig;
import com.spring.jdbcTemplate.service.AccountService;
import com.spring.jdbcTemplate.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author: Jason
 * @Date: 2022/11/17 14:21 14 21
 */
public class TestTransaction {

    @Test
    public void testTransfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTransactionManagement.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferUpdate();
    }

    // Test transaction manager with annotation
    @Test
    public void testTransactionManager() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferUpdate();
    }

    // Test transaction manager with annotation in a Functional Way
    @Test
    public void testTransactionManagerFuncationalStyle() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean(AccountService.class, ()->new AccountService());
        AccountService bean = (AccountService) context.getBean("com.spring.jdbcTemplate.service.AccountService");
        System.out.println(bean);
    }


    private static final Logger log = LoggerFactory.getLogger(TestTransaction.class);
    public static void main(String[] args) {
        log.info("Hello World");
        log.warn("Warn HW");
    }
}