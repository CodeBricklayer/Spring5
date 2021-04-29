package com.tanp.spring.demo2.testdemo;

import com.tanp.spring.demo2.autowire.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName EmpTest
 * @Description
 * @date 2021/4/26 23:07
 */
public class EmpTest {

    @Test
    public void testBean5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo2/bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
