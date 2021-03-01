package com.base;

public class TestBase {


    public final Person person;
    static ThreadLocal<Person> personThreadLocal = new ThreadLocal<Person>() {

        @Override
        protected Person initialValue() {
            return new Person();
        }
    };

    public TestBase() {
        person = new Person();
    }


    public static void main(String[] args) {
        //testChar();
        //testThreadlocal();

        /*TestBase base1 = new TestBase();

        TestBase base2 = new TestBase();*/

        System.out.println(01&11111);

    }

    private static void testThreadlocal() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(personThreadLocal.get());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(personThreadLocal.get());
            }
        }).start();
    }

    private static void testChar() {

        char a = '严';
        System.out.println((long) a);
        char c = '中';
        System.out.println(c);
    }


}
