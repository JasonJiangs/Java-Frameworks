package com.spring5.autowire;

/**
 * @Author: Jason
 * @Date: 2022/11/12 12:28 12 28
 */

/**
 * With bean5.xml
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

    public void testOut() {
        System.out.println(dept);
    }
}