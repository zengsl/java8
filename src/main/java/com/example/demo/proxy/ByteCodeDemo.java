package com.example.demo.proxy;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 11:01
 */
public class ByteCodeDemo {

    private int a = 1;

    public int add() {


        int b = 2;
        int c = a + b;
        System.out.println(c);
        return c;
    }
}
