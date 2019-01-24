package com.zachary.springanno.cap5;

import com.zachary.springanno.cap1.Person;
import com.zachary.springanno.cap5.config.Cap5MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class Cap5MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
        for (String name : app.getBeanNamesForType(Person.class)) {
            System.out.println(name);
        }

        Map<String, Person> map =
                app.getBeansOfType(Person.class);
        System.out.println(map);
    }
}
