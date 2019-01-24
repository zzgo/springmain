package com.zachary.springanno.cap5.config;

import com.zachary.springanno.cap1.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @Title:
 * @Author:Zachary
 * @Desc: 使用@Conditional 条件注册
 * @Date:2019/1/22
 **/
@Configurable
public class Cap5MainConfig {
    @Bean
    public Person person() {
        System.out.println("容器...");
        return new Person("admin", 100);
    }

    @Conditional(WindowCondition.class)
    @Bean
    public Person person1() {
        return new Person("admin", 10);
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Person person2() {
        return new Person("admin", 18);
    }
}
