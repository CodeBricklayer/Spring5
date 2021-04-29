package com.tanp.spring.demo2.testdemo;

import com.tanp.spring.demo2.collectiontype.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName StudentTest
 * @Description 工厂bean演示
 * @date 2021/4/26 21:52
 */
public class MyBeanTest {

    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
