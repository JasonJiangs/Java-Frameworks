package com.spring5.bean;

/**
 * @Author: Jason
 * @Date: 2022/11/12 11:35 11 35
 */

/**
 * Link to bean3
 */
public class book {
    public book() {
        System.out.println("Step1: Non Parameter Constructor");
    }

    private String aName;

    public void setaName(String aName) {
        this.aName = aName;
        System.out.println("Step 2: Get Set Function");
    }

    public void initMethod() {
        System.out.println("Step 3: Call Initialization Function from XML.");
    }

    public void destroyMethod() {
        System.out.println("Step 5: Call Destroy Method");
    }
}