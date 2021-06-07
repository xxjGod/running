package com.xxj.xxjsmile.base.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/25 16:47
 * All Rights Reserved
 */

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {

    boolean required() default false;
    public final static String USE_DEFAULT_NAME = "";

    boolean value() default true;



}
