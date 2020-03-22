package com.example.demo.instrument;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 21:34
 */
public class TestAgent {

    public static void agentmain(String args, Instrumentation instrumentation) {
        instrumentation.addTransformer(new TestTransformer(),true);
        try {
            instrumentation.retransformClasses(Base.class);
            System.out.println("Agent Load Done");
        } catch (UnmodifiableClassException e) {
            System.out.println("Agent Load Error");
            e.printStackTrace();
        }
    }
}
