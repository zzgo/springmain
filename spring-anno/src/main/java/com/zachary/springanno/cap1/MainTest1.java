package com.zachary.springanno.cap1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc: 通过 xml 形式去加载类信息
 * @Date:2019/1/22
 **/
public class MainTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
