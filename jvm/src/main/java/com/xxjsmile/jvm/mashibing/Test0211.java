package com.xxjsmile.jvm.mashibing;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

import java.nio.ByteBuffer;

public class Test0211 {

    private static Unsafe unsafe;

    static {
        try {
            // 获取 Unsafe 内部的私有的实例化单例对象
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            // 无视权限
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        //堆外内存
        heapOut();

    }

    //-XX:MaxDirectMemorySize=1M -XX:+DisableExplicitGC
    private static void heapOut() {
        //System.gc();
        ByteBuffer buffer = ByteBuffer.allocateDirect(10 * 1024 * 1024);
        //Unsafe unsafe = Bits.unsafe();

    }


}
