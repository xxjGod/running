package com.xxj.base;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/14 4:22 PM
 */

public class TestString {

    public static void main(String[] args) {

        test1();
    }

    private static void test1() {
//        String str = "${name}18了";
//        str.replace("${name}","xxj")
//                .replace("${age}",22+"");
//        System.out.println(str);
        String str = "河南省/郑州市/二七区";
        String[] split = str.split("/");
        System.out.println(split[split.length - 1]);

    }
}
