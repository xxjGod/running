package com.xxj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/12/20 10:50 AM
 */

public class Test11 {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(13);
        testasd(integers);
        System.out.println(integers);

        List<Num> numList = new ArrayList<>();
        numList.add(new Num(1));
        numList.add(new Num(2));

        testasda(numList);
        System.out.println(numList);
    }

    private static void testasda(List<Num> numList) {
        List<Num> numList2 = new ArrayList<>();
        numList2.add(new Num(3));
        numList2.add(new Num(4));
        numList = numList2;
    }

    private static void testasd(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        result.add(14);
        integers = result;
        //integers.add(15);
    }
}
