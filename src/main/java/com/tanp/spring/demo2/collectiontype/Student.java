package com.tanp.spring.demo2.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author CodeBricklayer
 * @ClassName Student
 * @Description 注入集合类属性 学生类
 * @date 2021/4/26 21:40
 */
public class Student {

    /**
     *数组类型属性
     */
    private String[] courses;

    /**
     * list集合类型属性
     */
    private List<String> list;


    /**
     * map集合类型属性
     */
    private Map<String,String> map;

    /**
     * set集合类型属性
     */
    private Set<String> set;

    /**
     * 学生所学多门课程
     */
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courseList=" + courseList +
                '}';
    }
}
