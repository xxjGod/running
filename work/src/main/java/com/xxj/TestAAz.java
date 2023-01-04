package com.xxj;

import lombok.*;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/12/21 4:43 PM
 */

@Builder


public class TestAAz {

    private  String name;


    private Long id;

    public static void main(String[] args) {
//        TestAAz build = TestAAz.builder().build();
//        TestAAz aAz = new TestAAz("123",2L);
//        Integer s = 2;
//        System.out.println(s == 2L);
        String str = " ";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.length());
    }
}
