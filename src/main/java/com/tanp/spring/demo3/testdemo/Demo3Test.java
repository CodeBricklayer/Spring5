package com.tanp.spring.demo3.testdemo;

import com.tanp.spring.demo3.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName Demo3Test
 * @Description
 * @date 2021/4/26 23:52
 */
public class Demo3Test {

    @Test
    public void testService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo3/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
