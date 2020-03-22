package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 测试
 *
 * @author Zengsl
 * @version V1.0
 * @date 2020-3-19 21:35
 */
public class Test {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("12"));

        Consumer<String> conn = x-> System.out.println(x);


        List<Integer> list = new ArrayList<>(16);
        list.stream();
    }
}
