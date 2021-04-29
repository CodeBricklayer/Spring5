package com.tanp.spring.demo5.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author CodeBricklayer
 * @ClassName UserDaoProxy
 * @Description 代理对象
 * @date 2021/4/27 21:59
 */
public class UserDaoProxy implements InvocationHandler {

    private Object obj;

    //把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 增强的逻辑
     *
     * @param proxy  对象
     * @param method 方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行...." + method.getName() + ":传递的参数..." + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行...." + obj);

        return res;
    }
}
