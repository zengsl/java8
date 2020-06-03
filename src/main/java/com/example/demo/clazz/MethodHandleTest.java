package com.example.demo.clazz;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-5-12 22:04
 */
public class MethodHandleTest {

    static class ClassA {
        public void println(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getPrintlnMH(obj).invokeExact("icfenix");
    }

    private static MethodHandle getPrintlnMH(Object reveiver) throws Throwable {
        MethodType methodType = MethodType.methodType(void.class, String.class);
        return lookup().findVirtual(reveiver.getClass(), "println", methodType).bindTo(reveiver);
    }
}
