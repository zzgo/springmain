package com.zachary.springanno.cap3;

import com.zachary.springanno.cap1.Person;
import com.zachary.springanno.cap3.config.Cap3MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        Person person1 = (Person) app.getBean("person");
        Person person2 = (Person) app.getBean("person");
//        没加@Scope 时
        System.out.println(person1 == person2);
    }
}
