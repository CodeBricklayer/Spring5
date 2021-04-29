package com.tanp.spring.demo2.collectiontype;

import java.util.List;

/**
 * @author CodeBricklayer
 * @ClassName Book
 * @Description 书籍类
 * @date 2021/4/26 22:03
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
