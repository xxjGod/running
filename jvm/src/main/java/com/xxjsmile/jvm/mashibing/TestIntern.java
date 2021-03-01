package com.xxjsmile.jvm.mashibing;

public class TestIntern {


    public static void main(String[] args) {
        String str1 = "xxj"+"smile";

        String str2 = "xxj";
        String str3 = str2+"smile";


        System.out.println(str1==str3.intern());
    }
}
