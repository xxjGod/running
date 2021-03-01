package com.base.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestList {


    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();


        copyOnWriteArrayList.add("xxj");
        copyOnWriteArrayList.add("xxr");

    }

    private static void test2() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("xxj");
        linkedList.add("xxr");



    }

    private static void test1() {


        ArrayList<String> list0 = new ArrayList<>(13);
        ArrayList<String> list = new ArrayList<>();
        list.add("xxj");
        list.add("str");
        list.add("smile");



    }


}
