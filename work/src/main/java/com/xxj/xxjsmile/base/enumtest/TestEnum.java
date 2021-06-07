package com.xxj.xxjsmile.base.enumtest;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/26 15:46
 * All Rights Reserved
 */
public class TestEnum {

    public static void main(String[] args) {
        GroupChangeTypeEnum create = GroupChangeTypeEnum.CREATE;


        System.out.println(create.name());
        System.out.println(create.getName());
        System.out.println(create.values().length);
    }
}


