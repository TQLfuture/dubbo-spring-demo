package consumer;

import com.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumeTest {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        String a = demoService.demoService("hello consumer");
        System.out.printf("我的" + a);
        context.close();
    }

}
