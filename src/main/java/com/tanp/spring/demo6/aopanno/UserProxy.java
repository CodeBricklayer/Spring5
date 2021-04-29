package com.tanp.spring.demo6.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author CodeBricklayer
 * @ClassName UserProxy
 * @Description 创建增强类
 * @date 2021/4/27 22:44
 */
@Component
@Aspect
@Order(3)
public class UserProxy {

    /**
     * 相同切入点抽取
     */
    @Pointcut(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void point(){

    }

    /**
     * 前置通知
     * @Before注解表示作为前置通知
     */
    @Before(value = "point()")
    public void before(){
        System.out.println("before....");
    }

    /**
     * 最终通知
     * @After注解表示作为最终通知
     */
    @After(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    /**
     * 后置通知（返回通知）
     * @AfterReturning注解表示作为后置通知
     */
    @AfterReturning(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("after returning....");
    }

    /**
     * 异常通知
     * @AfterThrowing注解表示作为异常通知
     */
    @AfterThrowing(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("after throwing....");
    }
    /**
     * 环绕通知
     * @Around注解表示作为环绕通知
     */
    @Around(value = "execution(* com.tanp.spring.demo6.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }



}
