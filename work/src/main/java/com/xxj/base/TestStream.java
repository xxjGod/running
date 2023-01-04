package com.xxj.base;

import com.xxj.xxjsmile.bean.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/21 6:13 PM
 */

public class TestStream {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers = integers.stream().filter(t->t/2==0).collect(Collectors.toList());
        System.out.println(integers);




    }


}
