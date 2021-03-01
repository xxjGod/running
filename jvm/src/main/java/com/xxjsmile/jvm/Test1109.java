package com.xxjsmile.jvm;

import com.xxjsmile.jvm.loadclass.Person;

public class Test1109 {


    public static void main(String[] args) {


        System.out.println(Person.class.getClassLoader());

        System.out.println(String.class.getClassLoader());


    }
}
