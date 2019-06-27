package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyTestClass {

    private String name;
    private List<String> stringList;

    public MyTestClass() {
    }

    public MyTestClass(String name) {
        this.name = name;
        this.stringList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElementToStringList(String el){
        this.stringList.add(el);
    }
}
