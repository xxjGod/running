package com.xxj.bean;

public interface PersonInterface {



     public final int age = 0;

     public abstract void test();


     //孩子用
     default void run1(){
         System.out.println("run1");
     }

     //自己用
     public static void run2(){
         System.out.println("run2");
     }

}
