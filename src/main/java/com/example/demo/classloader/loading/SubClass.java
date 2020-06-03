package com.example.demo.classloader.loading;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-23 21:13
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}
