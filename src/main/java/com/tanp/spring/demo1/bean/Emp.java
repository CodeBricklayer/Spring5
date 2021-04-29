package com.tanp.spring.demo1.bean;

/**
 * @author CodeBricklayer
 * @ClassName Emp
 * @Description 一对多演示 员工类
 * @date 2021/4/26 21:15
 */
public class Emp {
    private String name;
    private String gender;

    /**
     * 员工属于某一个部分，使用对象形式表示
     */
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
