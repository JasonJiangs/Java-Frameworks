package com.spring5.collectiontype;

/**
 * @Author: Jason
 * @Date: 2022/11/9 22:55 22 55
 */
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}