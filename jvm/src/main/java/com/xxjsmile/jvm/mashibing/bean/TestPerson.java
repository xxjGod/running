package com.xxjsmile.jvm.mashibing.bean;

public class TestPerson {

    private int num;

    public static void main(String[] args) {
       // Person person = new Person();
        //Person.main(new String[]{"xxj"});
       // Person.test1();
        //Person.getNum();
        TestPerson testPerson = new TestPerson();
        testPerson.test1();
    }

    public  void test1() {
//        int m;
//        m++;
        // Person person = new Person();
        //Person.main(new String[]{"xxj"});
        // Person.test1();
        //Person.getNum();
        num++;
        System.out.println(num);
    }
}
