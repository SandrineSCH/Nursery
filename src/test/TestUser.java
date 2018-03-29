import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.UserDao;
import com.entities.UsersEntity;

public class TestUser {
    private static ClassPathXmlApplicationContext context;
    private static UserDao usersDao;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("context.xml");
        usersDao = (UserDao) context.getBean("UserDao");

    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        context.close();

    }

    @Test
    public void test() {
        UsersEntity newUser = new UsersEntity();
        newUser.setUserName("Hello");
        newUser.setUserEmail("allam@gmail.com");
        usersDao.saveOrUpdate(newUser);

    }

}
