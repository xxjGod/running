package com.xxj.xxjsmile.bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/24 19:40
 * All Rights Reserved
 */
public class Test123 {


    public static void main(String[] args) {
        List<String> a = Arrays.asList("xxj","xxr");
        List<String> collect = a.stream().filter(t -> t.length() == 0).map(t->t+"a").collect(Collectors.toList());
        System.out.println(collect);
    }
}
