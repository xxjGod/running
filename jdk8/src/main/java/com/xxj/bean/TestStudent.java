package com.xxj.bean;

import java.lang.reflect.Method;

public class TestStudent {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.xxj.bean.Student");
        System.out.println(aClass);

        System.out.println(int[].class);
        //可获取自己的公共方法，可获取父类公共方法
        Method[] methods = aClass.getMethods();

        for (Method method:methods){
            if("setInfo".equals(method.getName())){
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (Class c:
                parameterTypes) {
                    System.out.println(c);
                }
                System.out.println(method);

            }
            //System.out.println(method);
        }
        System.out.println("#################");

        //可获取自己的私有方法，但不可获取父类
//        Method[] methodss = aClass.getDeclaredMethods();
//
//        for (Method method:methodss){
//            System.out.println(method);
//        }


    }


}
