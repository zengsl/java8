package com.example.demo.instrument;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 21:31
 */
public class TestTransformer implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        ClassPool classPool = ClassPool.getDefault();
        try {
            CtClass ctClass = classPool.get("com.example.demo.instrument.Base");
            CtMethod ctMethod = ctClass.getDeclaredMethod("process");
            ctMethod.insertBefore("{System.out.println(\"transformer start\");}");
            ctMethod.insertAfter("{System.out.println(\"transformer end\");}");
            return ctClass.toBytecode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
