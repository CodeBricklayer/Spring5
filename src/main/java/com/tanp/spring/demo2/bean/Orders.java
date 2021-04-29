package com.tanp.spring.demo2.bean;

/**
 * @author CodeBricklayer
 * @ClassName Orders
 * @Description bean生命周期的演示
 * @date 2021/4/26 22:38
 */
public class Orders {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用set方法设置值");
    }

    /**
     * 无参数构造器
     */
    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    /**
     *创建执行的初始化的方法
     */
    private void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }

    /**
     * 创建执行的销毁方法
     */
    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                '}';
    }
}
