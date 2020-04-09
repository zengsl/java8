package com.example.demo.tools;


/**
 * JHSDB调试工具测试
 *
 * 增加启动参数 -Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 *
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-9 21:59
 */
public class JhsdbTestCase {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();

            // 断点
            System.out.println("done");
        }

    }

    private static class ObjectHolder {

    }

    public static void main(String[] args) {
        Test test = new JhsdbTestCase.Test();
        test.foo();
    }
}
