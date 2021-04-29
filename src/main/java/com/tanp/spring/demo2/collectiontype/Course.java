package com.tanp.spring.demo2.collectiontype;

/**
 * @author CodeBricklayer
 * @ClassName Course
 * @Description 课程类
 * @date 2021/4/26 21:58
 */
public class Course {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
