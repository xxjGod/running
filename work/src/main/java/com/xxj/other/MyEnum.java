package com.xxj.other;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/10/17 4:45 PM
 */

public enum MyEnum {

    NAME,
    AGE;




    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.valueOf("123");
        System.out.println(myEnum);
    }


}

