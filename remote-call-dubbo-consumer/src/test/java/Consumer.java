
import com.wcc.dubbo.service.BaseDataService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author charse
 * @create 2018-09-03
 * @Description:
 */
public class Consumer {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        System.out.println("------------------");
        BaseDataService baseDataService = (BaseDataService)context.getBean("baseDataService"); // 获取远程服务代理
        String hello = baseDataService.query("123"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
        System.in.read(); // 按任意键退出

    }
}
