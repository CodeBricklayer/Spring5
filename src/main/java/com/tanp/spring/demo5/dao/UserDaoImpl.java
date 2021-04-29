package com.tanp.spring.demo5.dao;

/**
 * @author CodeBricklayer
 * @ClassName UserDaoImpl
 * @Description JDK动态代理
 * @date 2021/4/27 21:54
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了....");
        return id;
    }
}
