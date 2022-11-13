package com.spring5.FactoryBean;

import com.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Jason
 * @Date: 2022/11/9 23:18 23 18
 */
public class MyBean implements FactoryBean<Course> {

    // define return bean type, implements FactoryBean with Generics
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("ABC");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}