package com.example.demo.classloader.loading;

/**
 * @author Zengsl
 * @version V1.0
 * @date 2020-4-25 22:25
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };
        Object object = myLoader.loadClass("com.example.demo.classloader.loading.ClassLoaderTest").newInstance();
        System.out.println(object instanceof com.example.demo.classloader.loading.ClassLoaderTest);
    }
}
