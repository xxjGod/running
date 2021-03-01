package com.base.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {


    public static void main(String[] args) {
        //test1();
        // test2();
        //est3();
        test4();
    }

    private static void test4() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap();

        map.put("xxj", 18);
        map.put("xxr", 12);


    }

    private static void test3() {
        HashMap map = new HashMap();
        for (int i = 0; i < 13; i++) {
            map.put(i, "xxj");
        }


    }

    private static void test2() {
        int m = 10;
        System.out.println(++m > 10);

    }

    private static void test1() {

        HashMap<Object, String> map = new HashMap<>();

        Book book = new Book();
        Cat cat = new Cat();
        System.out.println(map.put(book, "21"));
        System.out.println(map.put(cat, "12"));
        System.out.println(map.size());

        System.out.println(map.get(book));

    }


}
