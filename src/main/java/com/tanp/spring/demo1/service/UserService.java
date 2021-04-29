package com.tanp.spring.demo1.service;

import com.tanp.spring.demo1.dao.UserDao;

/**
 * @author CodeBricklayer
 * @ClassName UserService
 * @Description 注入外部bean的演示
 * @date 2021/4/26 21:00
 */
public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.....");

        //原始方式：创建UserDao对象
//        UserDao userDao = new UserDaoImpl();
        userDao.update();
    }
}
