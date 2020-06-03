package com.example.demo.classloader.loading;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-23 21:27
 */
public class ConstClass {

    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLO_WORLD = "hello world";
}
