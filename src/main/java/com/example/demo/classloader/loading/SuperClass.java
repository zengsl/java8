package com.example.demo.classloader.loading;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-23 21:12
 */
public class SuperClass {

    static {
        System.out.println("Super Class init!");
    }

    public static int value = 123;
}

