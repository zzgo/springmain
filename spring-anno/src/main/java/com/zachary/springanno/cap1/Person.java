package com.zachary.springanno.cap1;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person" +
                " constructor....");
    }

    public Person(String name, int age) {
        System.out.println("Person" +
                " constructor....");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void init() {
        System.out.println("init....");
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
