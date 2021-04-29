package com.tanp.spring.demo4.dao;

import org.springframework.stereotype.Repository;

/**
 * @author CodeBricklayer
 * @ClassName UserDaoImpl
 * @Description 自动注入实现演示
 * @date 2021/4/27 21:07
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add..");
    }
}
