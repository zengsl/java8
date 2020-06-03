package com.example.demo.classloader.loading;

/**
 * 被动引用 案例
 *
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-23 21:14
 */
public class NotInitialization {

    /**
     * 被动引用 子类调用父类中的静态方法，父类会进行初始化而子类不会初始化
     * <br/>
     * 使用 -XX:+TraceClassLoading参数可以观察到子类是会加载的
     */
    /*public static void main(String[] args) {
        System.out.println(SubClass.value);
    }*/

    /**
     * 通过数组定义来引用类，不会触发此类的初始化
     */
    /*public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }*/

    /**
     * 非主动使用字段演示
     */
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO_WORLD);
        System.out.println(new int[1][2][3].getClass().getComponentType());
    }
}
