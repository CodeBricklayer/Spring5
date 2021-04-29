package com.tanp.spring.demo2.testdemo;

import com.tanp.spring.demo2.collectiontype.Book;
import com.tanp.spring.demo2.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName StudentTest
 * @Description 集合注入测试演示
 * @date 2021/4/26 21:52
 */
public class BookTest {

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
