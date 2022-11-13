package com.spring5.collectiontype;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/9 23:02 23 02
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}