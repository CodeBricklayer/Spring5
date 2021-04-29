package com.tanp.spring.demo1.model;

/**
 * @author CodeBricklayer
 * @ClassName Orders
 * @Description 使用有参数构造方法注入属性
 * @date 2021/4/25 23:33
 */
public class Orders {

    private String name;

    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
