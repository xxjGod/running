package com.xxj;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/12/20 6:25 PM
 */

public class Test111 {

    public static void main(String[] args) {
        String S = "ASDFASDF";
        setValue(S);
        System.out.println(S);
        int i = 466546;
        setValueInt(i);
        System.out.println(i);

        //发现 基本数据类型 和 String 经过方法处理后 值不变化  String本质是final类型char数组
        // 而数组 和 list 集合 经过 方法处理后  期 里面的值会发生变化
        //说明 基本数据类型 和String 是值拷贝，而 数组和list 集合处理的是引用
        StringBuilder str = new StringBuilder("546");
        setValue(str);
        System.out.println(str.toString()); //输出空字符串
        setValue2(str);
        System.out.println(str.toString()); //输出sss
    }

    public static void setValue(StringBuilder str) {
        str = new StringBuilder("sss111");
    }

    public static void setValue2(StringBuilder str) {
        str.append("sss222");
    }

    public static void setValue(String ss) {
        ss = "adfasdfa";
    }

    public static void setValueInt(int ss) {
        ss = 8888;
    }
}
