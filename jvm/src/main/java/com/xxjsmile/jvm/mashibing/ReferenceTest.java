package com.xxjsmile.jvm.mashibing;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {


    public final static int M = 1024 * 1024;

    public static void printlnMemory(String tag) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("\n" + tag + ":");
        System.out.println(runtime.freeMemory() / M + "M(free)/" + runtime.totalMemory() / M + "M(total)");
    }


    public static void main(String[] args) {
        //testStrong();
        testSoft();
        //testWeak();
        //testPhantom();
    }

    /**
     * 软引用 内存足够时，不回收，不足时回收
     */
    private static void testSoft() {

        printlnMemory("原内存");
        SoftReference<Object> softRerference = new SoftReference<Object>(new byte[100 * M]);
        printlnMemory("实例后内存");
        System.out.println("strongReference:" + softRerference.get());
        System.gc();
        printlnMemory("GC后");
        System.out.println("strongReference:" + softRerference.get());

        //-Xms200m -Xmx200m 用了100m 再创建一个80m的
        SoftReference<Object> softRerference2 = new SoftReference<Object>(new byte[80 * M]);
        printlnMemory("实例化一个80M的数组后");
        System.out.println("softRerference:" + softRerference.get());
        //System.gc();
        //printlnMemory("GC后");
        System.out.println("softRerference2 : " + softRerference2.get());


    }

    /**
     * 强引用 任何通过强用用使用的对象，不管系统多紧张都不会回收
     */
    private static void testStrong() {
        printlnMemory("原内存");
        byte[] strongReference = new byte[100 * M];
        printlnMemory("实例后内存");
        System.out.println("strongReference:" + strongReference);
        System.gc();
        printlnMemory("GC后");
        System.out.println("strongReference:" + strongReference);

        strongReference = null;
        printlnMemory("强引用断开");
        System.out.println("strongReference:" + strongReference);
        System.gc();
        printlnMemory("GC后");
        System.out.println("strongReference : " + strongReference);


    }


    /**
     * 弱引用 gc就回收
     */
    private static void testWeak() {
        printlnMemory("原内存");
        WeakReference<Object> weakReference = new WeakReference<Object>(new byte[100 * M]);
        printlnMemory("实例后内存");
        System.out.println("weakReference:" + weakReference.get());
        System.gc();
        printlnMemory("GC后");
        System.out.println("weakReference:" + weakReference.get());

    }


    private static void testPhantom() {

        byte[] bytes = new byte[100 * M];
        printlnMemory("原内存");
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(bytes, referenceQueue);
        printlnMemory("实例后内存");
        System.out.println("phantomReference:" + phantomReference);
        System.out.println("phantomReference.get:" + phantomReference.get());
        System.out.println("referenceQueue:" + referenceQueue.poll());
//        System.gc();
//
//        printlnMemory("GC后");
//        System.out.println("phantomReference:" + phantomReference);
//        System.out.println("phantomReference.get:" + phantomReference.get());
//        System.out.println("referenceQueue:" + referenceQueue.poll());

        //bytes = null;
        System.gc();
        printlnMemory("bytes=null后");
        System.out.println("phantomReference:" + phantomReference);
        System.out.println("phantomReference.get:" + phantomReference.get());
        //System.out.println("referenceQueue:" + referenceQueue.poll());


        //phantomReference=null;
        System.gc();
        printlnMemory("phantomReference=null后");
        System.out.println("phantomReference:" + phantomReference);
        //System.out.println("phantomReference.get:" + phantomReference.get());
        System.out.println("referenceQueue:" + referenceQueue.poll());


    }


}
