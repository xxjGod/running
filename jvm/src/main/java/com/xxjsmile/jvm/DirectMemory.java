package com.xxjsmile.jvm;

import java.nio.ByteBuffer;

//见与在JVM堆分配内存(allocate)相比，直接内存分配（allocateDirect）的访问性能更好，但分配较慢
public class DirectMemory {

    // 分配堆内存
    public static void bufferAccess() {
        long startTime = System.currentTimeMillis();
        ByteBuffer b = ByteBuffer.allocate(500);
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 99; j++)
                b.putInt(j);
            b.flip();
            for (int j = 0; j < 99; j++)
                b.getInt();
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("access_nondirect:" + (endTime - startTime));
    }

    // 直接分配内存
    public static void directAccess() {
        long startTime = System.currentTimeMillis();
        ByteBuffer b = ByteBuffer.allocateDirect(500);
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 99; j++)
                b.putInt(j);
            b.flip();
            for (int j = 0; j < 99; j++)
                b.getInt();
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("access_direct:" + (endTime - startTime));
    }

    public static void bufferAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ByteBuffer.allocate(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("allocate_nondirect:" + (endTime - startTime));
    }

    public static void directAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ByteBuffer.allocateDirect(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("allocate_direct:" + (endTime - startTime));
    }

    public static void main(String args[]) {
        System.out.println("访问性能测试：");
        bufferAccess();
        directAccess();

        System.out.println();

        System.out.println("分配性能测试：");
        bufferAllocate();
        directAllocate();
    }
}
