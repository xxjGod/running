package com.base.bean;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    Book book = new Book("默认");

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
