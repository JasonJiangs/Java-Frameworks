package com.spring5;

/**
 * @Author: Jason
 * @Date: 2022/11/6 23:00 23 00
 */

/**
 * using constructor injection
 */
public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }


//    public Orders() {
//    }
}