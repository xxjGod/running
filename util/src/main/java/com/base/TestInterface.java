package com.base;

public interface TestInterface {


    public abstract int getAge();

    public static final int AGE = 18;

    public static void test() {
        System.out.println("我是父类静态方法");
    }

    default int getDefault(){
        System.out.println("我是默认方法");
        return 0;
    }


}
