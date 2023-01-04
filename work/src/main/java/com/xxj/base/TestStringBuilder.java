package com.xxj.base;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/27 6:05 PM
 */

public class TestStringBuilder {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "234");
        StringBuilder sb0 = new StringBuilder();

        StringBuilder sb1 = new StringBuilder();
        sb1.append(list);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ").append("2");

        System.out.println(sb0.length());

        sb0.append(sb1).append(sb2);
        System.out.println(sb0.toString());
    }
}
