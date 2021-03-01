package com.xxjsmile.objectquote;

public class Test123 {


    public static void main(String[] args) {
        Son son = new Son("xxj", 18, new Car("宝马"));

        Father father = new Father();
        father.setSon(son);

        System.out.println(father);


        son.setCar(new Car("奔驰"));
        System.out.println(father);

    }
}
