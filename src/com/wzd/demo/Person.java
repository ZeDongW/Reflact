package com.wzd.demo;

/**
 * @author ：Administrator
 * @title :Person
 * @projectName :Reflact
 * @description：对象
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 12:38
 * @modified By：
 */
public class Person {
    private int id ;
    public String name;

    private Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void eat(int i){
        System.out.println("吃了" + i + "斤饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
