package com.tanp.spring.demo4.testdemo;

import com.tanp.spring.demo4.config.SpringConfig;
import com.tanp.spring.demo4.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CodeBricklayer
 * @ClassName SpringTest
 * @Description 测试类
 * @date 2021/4/27 21:23
 */
public class SpringTest {
    @Test
    public void testSpringConfig(){
        //加载配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
