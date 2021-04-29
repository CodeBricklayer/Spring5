package com.tanp.spring.demo1.model;

/**
 * @author CodeBricklayer
 * @ClassName School
 * @Description 演示其他类型属性注入
 * @date 2021/4/25 23:47
 */
public class School {

    private String name;

    private String teacher;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
