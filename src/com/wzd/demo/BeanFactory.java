package com.wzd.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ：Administrator
 * @title :BeanFactory
 * @projectName :Reflact
 * @description：对象工厂，创建对象
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 12:45
 * @modified By：
 */
public class BeanFactory {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /**
         * 获取Class的三种方法
         */
        //通过类名获取字节码对象，推荐使用这种
        Class clazz = Class.forName("com.wzd.demo.Person");
        //通过.class获取字节码对象
//        Class clazz = Person.class;
        //通过对象获取字节码文件
//        Class clazz = new Person(110,"张三").getClass();
//        System.out.println(clazz);
        Constructor constructor = clazz.getDeclaredConstructor(int.class, String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance(110, "张三");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        Method eat = clazz.getDeclaredMethod("eat", int.class);
        eat.invoke(o,3);
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field id = clazz.getDeclaredField("id");
        System.out.println(id);
    }
}
