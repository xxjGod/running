package com.xxj;

import java.util.*;

public class TestGeneric {

    public static void main(String[] args) {

//        List<?> list = new ArrayList<>();
//        list.add();
//        List<String> l1 = new ArrayList<String>();
//        List<Integer> l2 = new ArrayList<Integer>();
//        //  输出为true，擦除后的类型为List
//        System.out.println(l1.getClass());
//        System.out.println(l2.getClass());
//        System.out.println(l1.getClass() == l2.getClass());
        Set<String> set1 = new HashSet<>(Arrays.asList("1", "2"));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2));
        //https://www.cnblogs.com/jian0110/p/10690483.html
        //get(set1,set2);
    }

    private static void unsafeAdd(List list, Object o) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, new Integer(1));
        String s = strings.get(0);
        list.add(o);
    }

    private static <E> Set<E> get(Set<E> e1, Set<E> e2) {
        Set result = new HashSet();
        result.add(e1);
        return result;
    }


}
