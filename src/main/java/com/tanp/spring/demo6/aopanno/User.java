package com.tanp.spring.demo6.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author CodeBricklayer
 * @ClassName User
 * @Description 用户类 被增强的累
 * @date 2021/4/27 22:43
 */
@Component
public class User {
    public void add(){
//        int i = 10/0;
        System.out.println("add....");
    }
}
