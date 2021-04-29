package com.tanp.spring.demo8.test;

import com.tanp.spring.demo8.config.TxConfig;
import com.tanp.spring.demo8.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName AccountTest
 * @Description
 * @date 2021/4/28 23:17
 */
public class AccountTest {

    @Test
    public void testTx() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo8/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testTx2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo8/bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testTx3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
