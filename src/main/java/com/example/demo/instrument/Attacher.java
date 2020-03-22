package com.example.demo.instrument;


import com.sun.tools.attach.VirtualMachine;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-21 21:54
 */
public class Attacher {

    public static void main(String[] args) throws Exception {
        // 传入目标 JVM pid
        VirtualMachine vm = VirtualMachine.attach("10968");
        vm.loadAgent("D:/selfwork/java8/src/main/java/com/example/demo/instrument/test-agent.jar");
    }
}
