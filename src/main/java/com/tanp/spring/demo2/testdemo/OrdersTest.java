package com.tanp.spring.demo2.testdemo;

import com.tanp.spring.demo2.bean.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName StudentTest
 * @Description 集合注入测试演示
 * @date 2021/4/26 21:52
 */
public class OrdersTest {

    @Test
    public void testBean4() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        /*手动让bean实例销毁*/
//        ((ClassPathXmlApplicationContext)context).close();
        context.close();
    }
}
