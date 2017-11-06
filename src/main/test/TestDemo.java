import com.lanou.sp.action.UserAction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dllo on 17/11/6.
 */
public class TestDemo {

    private ApplicationContext ctx;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("annotationTestContext.xml");
    }

    @Test
    public void test(){
        UserAction userAction = (UserAction) ctx.getBean("userAction");
        System.out.println(userAction.login());
    }

}
