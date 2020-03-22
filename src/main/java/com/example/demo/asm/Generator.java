package com.example.demo.asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 20:25
 */
public class Generator {

    public static void main(String[] args) throws IOException {
        ClassReader classReader = new ClassReader("com/example/demo/asm/Base");
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        // 处理
        ClassVisitor classVisitor = new MyClassVisitor(classWriter);
        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
        byte[] data = classWriter.toByteArray();
        // 输出
        File file = new File("D:\\selfwork\\java8\\target\\classes\\com\\example\\demo\\proxy\\asm\\Base.class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(data);
        fileOutputStream.close();
        System.out.println("now generator cc success");
    }
}
