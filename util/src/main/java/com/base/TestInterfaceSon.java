package com.base;

public class TestInterfaceSon implements TestInterface {


    @Override
    public int getAge() {
        return 18;
    }

    @Override
    public int getDefault() {
        return 19;
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterfaceSon();
        System.out.println(testInterface.getAge());
        System.out.println(testInterface.getDefault());
        TestInterface.test();
    }
}
