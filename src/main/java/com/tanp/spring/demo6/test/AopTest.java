package com.tanp.spring.demo6.test;

import com.tanp.spring.demo6.aopanno.User;
import com.tanp.spring.demo6.aopxml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName AOPTest
 * @Description 测试类
 * @date 2021/4/27 22:54
 */
public class AopTest {
    @Test
    public void testAopAnno(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo6/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void testAopXml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo6/bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
