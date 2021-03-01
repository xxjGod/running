package com.xxj.bean;

import javax.management.openmbean.OpenType;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Testxxj {


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Method[] declaredMethods = Person.class.getDeclaredMethods();
//        for (Method method:
//        declaredMethods ) {
//            System.out.println("######begin######");
//            System.out.println(method.getName());
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class clz:
//            parameterTypes) {
//                System.out.println(clz);
//            }
//            System.out.println("######end######");
//        }
//        System.out.println(Integer[].class);
//        System.out.println(Boolean[].class);
//        System.out.println(Character[].class);
//        System.out.println(String[].class);
//        System.out.println(Integer.class);
//        test(12);
        /*Person person = new Person();
        test2(person);*/
//        Person person = new Person();
//        Method[] declaredMethods = Person.class.getDeclaredMethods();
//        for (Method method:
//        declaredMethods) {
//            //System.out.println(method.getName());
//            if(method.getName().equals("test5")){
//                method.invoke(null,new Object[]{2,"12"});
//            }
//        }
//        Class stringClass = String[].class;
//        OpenType[] o = new OpenType[]{};
        Method[] declaredMethods = Testxxj.class.getDeclaredMethods();
        for (Method method:
        declaredMethods) {
            if(method.getName().equals("test9")){
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (Class clz:
                parameterTypes) {
//                    System.out.println(clz.getTypeName());
//                    System.out.println(clz.getName());
//                    System.out.println(clz.getSimpleName());
                    System.out.println(clz.getComponentType());
                    Object newArray = Array.newInstance(clz.getComponentType(), 2);
                    System.out.println(newArray);

                }

            }
        }

    }

    public static void test(Integer... integers) {
        System.out.println(integers.getClass());
    }

    public  void test9(OpenType[] openTypes,String[] str) {
    }

    public static void test2(Person... people) {
        System.out.println(people);
    }

}
