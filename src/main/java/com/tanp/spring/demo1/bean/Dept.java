package com.tanp.spring.demo1.bean;

/**
 * @author CodeBricklayer
 * @ClassName Dept
 * @Description 一对多的演示 部门类
 * @date 2021/4/26 21:14
 */
public class Dept {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
