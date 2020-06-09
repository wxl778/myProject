import com.dreamer.dao.IUserDao;
import com.dreamer.domain.IUser;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class myTest {
    private InputStream in;
    private SqlSessionFactory factory;


    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("spring/applicationContext.xml");
        factory = new SqlSessionFactoryBuilder().build(in);

    }

    @After
    public void destroy() throws Exception {

        in.close();
    }

    @Test
    public void run1() {
        SqlSession session = factory.openSession();
        IUserDao iuserDao = session.getMapper(IUserDao.class);
        List<IUser> all = iuserDao.findAll();
        System.out.println(all);


        session.close();//释放一级缓存

    }
}
