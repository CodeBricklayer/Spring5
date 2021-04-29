package com.tanp.spring.demo2.autowire;

/**
 * @author CodeBricklayer
 * @ClassName EMP
 * @Description
 * @date 2021/4/26 23:04
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
