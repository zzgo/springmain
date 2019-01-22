package com.zachary.springanno.cap4;

import com.zachary.springanno.cap4.config.Cap4MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class Cap4MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        System.out.println("======");
        app.getBean("person");
        System.out.println("======");
    }
}
