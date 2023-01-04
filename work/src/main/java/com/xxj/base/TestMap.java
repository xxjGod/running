package com.xxj.base;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/13 2:17 PM
 */

public class TestMap {

    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {
        List<BaseObject> m = run1(0);
        System.out.println(1);

        List<String> collect = run1(0).stream().map(BaseObject::getName).collect(Collectors.toList());


        System.out.println(collect);
    }

    private static List<BaseObject> run1(int a) {
        if (a == 0) {
            return new ArrayList<>();
        }
        List<BaseObject> m = new ArrayList<>();
        m.add(new BaseObject("1"));
        return m;
    }


    private static void test1() {
        Map<String, List<BaseObject>> result = new HashMap<>();
        List<BaseObject> m = new ArrayList<>();
        m.add(new BaseObject("1"));
        result.put("12", m);
        List<BaseObject> n = new ArrayList<>();
        n.add(new BaseObject("2"));
        result.get("12").addAll(n);
        System.out.println(result);


    }
}
