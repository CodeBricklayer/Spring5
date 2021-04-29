package com.tanp.spring.demo1.model;

/**
 * @author CodeBricklayer
 * @ClassName Book
 * @Description 基于XML方式演示属性注入
 * @date 2021/4/25 23:24
 */
public class Book {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("abc");
    }
}
