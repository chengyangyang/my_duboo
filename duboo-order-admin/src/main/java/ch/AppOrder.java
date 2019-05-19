package ch;

import ch.modules.service.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 *
 * @author cy
 * @date 2019年05月17日 17:56
 * version 1.0
 */
public class AppOrder {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("/duboo/consumer.xml");
        MemberService bean = app.getBean(MemberService.class);
        System.out.println("订单服务开始运行");
        String user = bean.getUser(111L);
        System.out.println("返回结果:"+user);
        try {
            System.in.read(); // 保持服务一直在运行
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
