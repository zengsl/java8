package com.example.demo.tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 增加启动参数 -Xms100m -Xmx100m -XX:+UseSerialGC
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-9 22:23
 */
public class JconsoleTestCase {

    /**
     * 内存占位符对象，一个OOMObject大约占64kb
     */
    static class OOMObject {
        public byte[] placeHolder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }

}
