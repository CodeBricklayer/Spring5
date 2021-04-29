package com.tanp.spring.demo2.testdemo;

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
public class StudentTest {

    @Test
    public void testBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
