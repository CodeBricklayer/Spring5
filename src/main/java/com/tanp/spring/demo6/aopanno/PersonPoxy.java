package com.tanp.spring.demo6.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author CodeBricklayer
 * @ClassName PersonPoxy
 * @Description 增强类的优先级
 * @date 2021/4/27 23:10
 */
@Component
@Aspect
@Order(1)
public class PersonPoxy {

    @Before(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void before(){
        System.out.println("PersonProxy before....");
    }
}
