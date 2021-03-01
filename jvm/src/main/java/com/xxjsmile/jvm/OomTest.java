package com.xxjsmile.jvm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

//1.6 -XX:PermSize=9M -XX:MaxPermSize=9M
//1.7 -XX:PermSize=9M -XX:MaxPermSize=9M
//1.8 -XX:MetaspaceSize=9M -XX:MaxMetaspaceSize=9M
//使用jdk7或者更高版本的jdk运行这段会得到不同的结果。无论在jdk7中继续使用-XX:MaxPermSize还是
//jdk8及以上-XX:MaxMeta-spaceSize
public class OomTest extends ClassLoader {

    public static void main(String[] args) {
        int j = 0;
        try {

            OomTest method = new OomTest();

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
