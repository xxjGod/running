package com.xxj.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/10/13 4:48 PM
 */

public class TestList {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        ArrayList<Object> l1 = new ArrayList<>();
        ArrayList<Long> l3 = new ArrayList<>();

        Method method = l1.getClass().getDeclaredMethod("add", Object.class);
        method.invoke(l1, "1234");
        method.invoke(l1, "245");


        for (int i = 0; i < l1.size(); i++) {
            l3.add(Long.parseLong(l1.get(i)+""));
            //System.out.println();
        }
        System.out.println(l3);

    }

}
