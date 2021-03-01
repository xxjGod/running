package com.xxjsmile.jvm.loadclass;
//1:new、getstatic、putstatic、invokestatic(对于静态字段，只有直接定义这个类才会被初始化)
//2:使用反射调用的时候，如果类型没有进行初始化，则需要先触发其初始化
//3:当初始化子类的时候，发现有父类，则先触发父类初始化
//4:当虚拟机启动时，包含main方法的那个类


public class TestInitialize {


    public static void main(String[] args) throws ClassNotFoundException {

        //子类调用父类的静态属性不会触发子类初始化
        //System.out.println(SubClass.value);
        //System.out.println(SubClass.father());
        //通过数组定义来引用类，不会触发类初始化
        /*SuperClass[] superClasses = new SuperClass[10];*/
        //常量在编译阶段会存入常量池，因此不会触发定义常量的类初始化
        //int value = SuperClass.VALUE;
        //SuperClass[] superClasses = new SuperClass[10];
        //System.out.println(superClasses.getClass().getTypeName());

        Class.forName("com.xxjsmile.jvm.loadclass.Person");


    }


}
