import com.spring.jdbcTemplate.entity.User;
import com.spring.jdbcTemplate.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/16 23:15 23 15
 */
public class TestJDBC {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User.UserBuilder userBuilder = User.builder().userId(0).username("Tom").status("Open To network");
        User user1 = userBuilder.build();
        user1.setUserId(1);
        User user2 = userBuilder.build();
        user2.setUserId(2);
        User user3 = userBuilder.build();
        user3.setUserId(3);
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
    }

    @Test
    public void testUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User.UserBuilder userBuilder = User.builder().userId(12).username("James").status("Open To network");
        User user1 = userBuilder.build();
        userService.updateUser(user1);
    }

    @Test
    public void testDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.deleteUser(12);
    }

    @Test
    public void testCountTotal() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int i = userService.countTotal();
        System.out.println(i);
    }

    @Test
    public void testFindOneUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User one = userService.findOne(1);
        System.out.println(one);
    }

    @Test
    public void testFindUserAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> userList = userService.findUserList();
        System.out.println(userList);
    }

    @Test
    public void testBatchAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> listObj = new ArrayList<>();
        Object[] o1 = {4, "Jim", "Job Found"};
        Object[] o2 = {5, "Lily", "Open to work"};
        Object[] o3 = {6, "Peter", "Job Searching"};
        listObj.add(o1);
        listObj.add(o2);
        listObj.add(o3);
        userService.batchAdd(listObj);
    }

    @Test
    public void testBatchDelete() {
        // ...
    }

    @Test
    public void testBatchUpdate() {
        // ...
    }


}