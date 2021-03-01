package com.xxjsmile.jvm.mashibing;

public class TestIntegerAndString {


    public static void main(String[] args) {
        //testInteger();
        //testString();
        //plusString();
        plusString();
        appendString();

    }

    public static void testInteger() {
        //-128  -- 127
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.println(i5 == i6);


    }

    public static void testString() {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = "abcd";
        String s4 = "abcd";
        System.out.println(s3 == s4);

        String str1 = new String("abcde");
        String str2 = new String("abcde");
        System.out.print(str1 == str2);//false


    }


    public static void plusString() {
        //对于字符串常量的+号连接，在程序编译期，jvm会将其优化为+连接后的值
        String s1 = "a1";
        String s2 = "a" + 1;
        System.out.println(s1 == s2);
    }

    public static void appendString() {
        //对于字符串引用的+号连接问题，由于字符串引用在编译期是无法确定的，
        String s1 = "a1";
        String s3 = "a";
        String s2 = s3
                + 1;
        System.
                out.println(s1 == s2);
    }

    public static void appendFinalString() {
        final String str1 = "a";
        String str2 = "ab";
        String str3 = str1 + "b";
        System.out.print(str2 == str3);//true

    }


}
