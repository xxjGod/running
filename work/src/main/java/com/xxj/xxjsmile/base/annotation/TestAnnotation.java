package com.xxj.xxjsmile.base.annotation;

import java.lang.annotation.Annotation;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/25 16:50
 * All Rights Reserved
 */
public class TestAnnotation {





    public static void main(String[] args) {

        Son son = new Son();
        Annotation[] annotations = son.getClass().getAnnotations();
        for (Annotation an:annotations){
            System.out.println(an);
        }
    }
}
