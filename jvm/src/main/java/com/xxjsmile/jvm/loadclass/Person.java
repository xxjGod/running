package com.xxjsmile.jvm.loadclass;

public class Person {


    static {
        System.out.println("static init");
    }

    {
        System.out.println("constuctor init");

    }

    public static void test(){
        System.out.println("static test");
    }

    public Person() {
    }

    public void add() throws Exception {

        // Person2 person2 = new Person2();
        System.out.println(Class.forName("com.xxjsmile.jvm.loadclass.Person").getClassLoader());
        System.out.println(Class.forName("sun.net.www.protocol.http.HttpURLConnection").getClassLoader());


        System.out.println("@@@1:" + Person.class.getClassLoader()); //com.xxjsmile.jvm.TestClassLoader$1@266474c2
        //Person.class.getClassLoader()，可能会导致和当前线程所运行的类加载器不一致
        System.out.println("@@:" + Thread.currentThread().getContextClassLoader()); //@@:sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("add method");
        System.out.println("!!!:" + ClassLoader.getSystemClassLoader());
        System.out.println("this:" + this.getClass().getClassLoader());

        System.out.println("person:" + new Person().getClass().getClassLoader());


    }
}
