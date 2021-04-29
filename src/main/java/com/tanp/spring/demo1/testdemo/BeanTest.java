package com.tanp.spring.demo1.testdemo;

import com.tanp.spring.demo1.bean.Emp;
import com.tanp.spring.demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName TestBean
 * @Description 测试外部bean注入
 * @date 2021/4/26 21:09
 */
public class BeanTest {

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    @Test
    public void testBean4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }
    @Test
    public void testBean5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1/bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }
}
