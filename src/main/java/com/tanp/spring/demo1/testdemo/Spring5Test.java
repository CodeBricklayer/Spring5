package com.tanp.spring.demo1.testdemo;

import com.tanp.spring.demo1.model.Book;
import com.tanp.spring.demo1.model.Orders;
import com.tanp.spring.demo1.model.School;
import com.tanp.spring.demo1.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName TestSpring5
 * @Description 测试xml创建bean
 * @date 2021/4/25 22:46
 */
public class Spring5Test {

    @Test
    public void testAdd() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean1.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.getName());
    }

    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders.toString());
    }

    @Test
    public void testBook2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean1.xml");
        Book book = context.getBean("book2", Book.class);
        System.out.println(book.getName());
    }

    @Test
    public void testSchool() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean1.xml");
        School school = context.getBean("school", School.class);
        System.out.println(school.toString());
    }
}
