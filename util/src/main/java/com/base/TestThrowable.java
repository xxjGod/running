package com.base;

public class TestThrowable {


    public static void main(String[] args) {
        //test1();
//        try {
//            test2();
//        }catch (Exception e){
//            System.out.println(e.getCause());
//        }

        test3();

    }

    private static void test3() {

        int[] a = new int[3];
        //a[0]="xxj";
    }

    private static void test2() throws MyException {
        throw new MyException(new RuntimeException("运行时异常"));
    }

    private static void test1() {

        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement se :
                    stackTrace) {
                System.out.println(se.getClassName() + se.getLineNumber());
            }

            System.out.println(e.getCause());
            e.printStackTrace();

        }
    }


}
