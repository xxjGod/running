package com.xxjsmile.jvm.loadclass;

import java.lang.reflect.Method;

public class LoadPerson {

    public static void main(String[] args) throws Exception {
        //默认
        Person person1 = new Person();
        person1.add();

        System.out.println("############");
        MyClassLoader myClassLoader = new MyClassLoader("/Users/xiaoxiangjie/project/testproject/running/jvm/src/main/java/");

        Class<?> aClass = myClassLoader.findClass("com.xxjsmile.jvm.loadclass.Person");
        Object person = aClass.newInstance();

        Method method = aClass.getDeclaredMethod("add");
        method.invoke(person);

        System.out.println("final:"+Person.class.getClassLoader());


    }
}
