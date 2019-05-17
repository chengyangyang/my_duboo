package ch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 *
 * @author cy
 * @date 2019年05月17日 17:56
 * version 1.0
 */
public class AppMember {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("/duboo/provider.xml");
        app.start();
        System.out.println("会员服务已经启动！");
        try {
            System.in.read(); // 保持服务一直在运行
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
