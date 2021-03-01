package com.xxj.bean;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class PersonTest {

    public static void main(String[] args) throws NoSuchMethodException {


        //System.out.println(long[].class);
//        try {
//            String encoderString = URLEncoder.encode("小姐姐", "utf-8");
//            System.out.println(encoderString);
//
//            // System.out.println(URLDecoder.decode("%E5%B0%8F%E5%A7%90%E5%A7%90","utf-8"));
//
//            System.out.println(URLDecoder.decode("%1233", "utf-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        PersonClass personClass = new PersonClass() {
//            @Override
//            public void test() {
//                System.out.println("123");
//            }
//        };
//        personClass.test();
//        personClass.run1();
//        PersonInterface.run2();

//        Method test = Person.class.getDeclaredMethod("test", new Class[]{String.class, Integer.class});
//
//        System.out.println(test);
//        Class clazz = Person.class;
//        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//        for (Constructor constructor:
//        declaredConstructors) {
//            constructor.setAccessible(true);
//            Class[] parameterTypes = constructor.getParameterTypes();
//            for (Class parameterType:
//            parameterTypes) {
//                System.out.println(parameterType);
//
//            }
//            //Object jsInjectFilterConfig = constructor.newInstance(new Object[]{standardContext, jsInjectFilterDef});
//
//            System.out.println(constructor);
//        }


    }
}
