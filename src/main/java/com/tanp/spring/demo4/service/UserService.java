package com.tanp.spring.demo4.service;

import com.tanp.spring.demo4.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CodeBricklayer
 * @ClassName UserService
 * @Description
 * @date 2021/4/26 23:50
 */
@Service(value = "userService")
public class UserService {

//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    private UserDao userDao;

//    @Resource
//    private UserDao userDao;

    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add() {
        System.out.println("service add....");
        userDao.add();
        System.out.println(name);
    }
}
