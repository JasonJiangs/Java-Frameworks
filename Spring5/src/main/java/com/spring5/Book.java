package com.spring5;

/**
 * @Author: Jason
 * @Date: 2022/11/6 22:38 22 38
 */

// dependency injection using set()
public class Book {
    private String author;
    private String bName;
    private String address;

    // injection using set()
    public void setbName(String bName) {
        this.bName = bName;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void show() {
        System.out.println(author + " writes " + bName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bName='" + bName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}