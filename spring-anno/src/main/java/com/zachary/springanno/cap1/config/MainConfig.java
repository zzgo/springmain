package com.zachary.springanno.cap1.config;

import com.zachary.springanno.cap1.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
@Configurable
public class MainConfig {

    @Bean
    public Person person01() {
        return new Person("admin", 10);
    }
}
