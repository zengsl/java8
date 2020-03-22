package com.example.demo.instrument;

import java.lang.management.ManagementFactory;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 21:28
 */
public class Base {


    public static void main(String[] args) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String s = name.split("@")[0];
        System.out.println("pid = " + s);
        while (true) {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            process();
        }
    }

    public static void process() {
        System.out.println("process");
    }
}
