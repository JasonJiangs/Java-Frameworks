package com.spring5.bean;

/**
 * @Author: Jason
 * @Date: 2022/11/7 13:19 13 19
 */
public class Emp {
    private String eName;
    private String gender;

    // represent in form of object
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}