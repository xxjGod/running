/*
package com.xxjsmile.utility;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

*/
/**
 * 博客：http://itstack.org
 * 论坛：http://bugstack.cn
 * 公众号：bugstack虫洞栈  ｛获取学习源码｝
 * create by fuzhengwei on 2019
 *//*

public class JvmStack extends ClassLoader {

    private static final long MB = 1048576L;
    //b/1024 kb /1024

    public static void printMemoryInfo() {
        MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
        MemoryUsage headMemory = memory.getHeapMemoryUsage();


        String info = String.format("\ninit: %s\t max: %s\t used: %s\t committed: %s\t use rate: %s\n",
                headMemory.getInit() / MB + "MB",
                headMemory.getMax() / MB + "MB", headMemory.getUsed() / MB + "MB",
                headMemory.getCommitted() / MB + "MB",
                headMemory.getUsed() * 100 / headMemory.getCommitted() + "%"

        );

        System.out.print(info);

        MemoryUsage nonheadMemory = memory.getNonHeapMemoryUsage();

        info = String.format("init: %s\t max: %s\t used: %s\t committed: %s\t use rate: %s\n",
                nonheadMemory.getInit() / MB + "MB",
                nonheadMemory.getMax() / MB + "MB", nonheadMemory.getUsed() / MB + "MB",
                nonheadMemory.getCommitted() / MB + "MB",
                nonheadMemory.getUsed() * 100 / nonheadMemory.getCommitted() + "%"

        );
        System.out.println(info);
        System.out.println("#############");
        long m1 = Runtime.getRuntime().totalMemory();
        long m2 = Runtime.getRuntime().freeMemory();
        long m3 = m1 - m2;
        System.out.println("m1:" + m1 / MB + "m2:" + m2 / MB + "m3:" + m3 / MB);
        System.out.println("#############");

    }

    public static void printGCInfo() {
        List<GarbageCollectorMXBean> garbages = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean garbage : garbages) {
            String info = String.format("name: %s\t count:%s\t took:%s\t pool name:%s",
                    garbage.getName(),
                    garbage.getCollectionCount(),
                    garbage.getCollectionTime(),
                    Arrays.deepToString(garbage.getMemoryPoolNames()));
            System.out.println(info);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static void runStack() {

        //init: 128MB	 max: 1820MB	 used: 10MB	 committed: 123MB	 use rate: 8%
        //init: 2MB	 max: 0MB	 used: 5MB	 committed: 7MB	 use rate: 71%


        final List<String> list = new ArrayList<String>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //int i = 0;

                while (true) {
                    list.add("xxjsmile");

                }


            }
        },"xxjsmile").start();
        //oom();

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new Runnable() {
            public void run() {
                JvmStack.printMemoryInfo();
                JvmStack.printGCInfo();
                System.out.println("===================================================================================================");
            }
        }, 0, 50, TimeUnit.MILLISECONDS);


    }

    public static void oom() {

        int j = 0;
        try {

            JvmStack method = new JvmStack();

            for (int i = 0; i < 10000; i++) {

                ClassWriter classWriter = new ClassWriter(0);
                // 定义对象头；版本号、修饰符、全类名、签名、父类、实现的接口

                //注意
                classWriter.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);

                byte[] code = classWriter.toByteArray();

                method.defineClass("Class" + i, code, 0, code.length);
                j++;
            }
        } catch (Exception e) {

        } finally {
            System.out.println(j);
        }

    }

}
*/
