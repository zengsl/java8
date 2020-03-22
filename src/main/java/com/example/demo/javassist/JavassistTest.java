package com.example.demo.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 21:12
 */
public class JavassistTest {
    public static void main(String[] args) throws Exception {
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.get("com.example.demo.javassist.Base");
        CtMethod ctMethod = ctClass.getDeclaredMethod("process");
        ctMethod.insertBefore("{System.out.println(\"javassist start\");}");
        ctMethod.insertAfter("{System.out.println(\"javassist end\");}");
        Class c = ctClass.toClass();

        Base base = (Base) c.newInstance();
        // 此时已经将原Base的字节码修改了，但是.class文件实际上是没有被修改的
        base.process();


        // 覆盖原.class文件
        ctClass.writeFile("D:\\selfwork\\java8\\target\\classes");
    }
}
