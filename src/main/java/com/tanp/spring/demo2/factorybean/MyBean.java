package com.tanp.spring.demo2.factorybean;

import com.tanp.spring.demo2.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author CodeBricklayer
 * @ClassName MyBean
 * @Description 工厂bean的演示
 * @date 2021/4/26 22:16
 */
public class MyBean implements FactoryBean<Course> {

    /**
     * 定义返回bean
     * @return
     * @throws Exception
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("abc");
        return course;
    }

    @Override
    public Class<Course> getObjectType() {
        return Course.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
