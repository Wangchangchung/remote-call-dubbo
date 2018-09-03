
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author charse
 * @create 2018-09-03
 * @Description:
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }

}
