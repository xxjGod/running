package com.base.bean;

public class TestStudent {

    public static void main(String[] args) {
//        Student student = new Student();
//        Book book = student.book;
//        System.out.println(book);
//        student.book = new Book("三国演义");
//        System.out.println(student.book);
//
//        System.out.println(book);

        Student[] students = new Student[6];
        students[0] = new Student("xxj");
        students[1] = new Student("xxr");

        Student s1 = students[0];

        System.out.println(s1);

        students[0]=null;
        System.out.println(s1);

    }

}
