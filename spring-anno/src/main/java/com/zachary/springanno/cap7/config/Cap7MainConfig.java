package com.zachary.springanno.cap7.config;

import com.zachary.springanno.cap1.Person;
import com.zachary.springanno.cap6.entity.Cat;
import com.zachary.springanno.cap6.entity.Dog;
import com.zachary.springanno.cap6.entity.Monkey;
import com.zachary.springanno.cap6.entity.Tiger;
import com.zachary.springanno.cap7.entiy.Train;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
@Configurable
@ComponentScan(value = "com.zachary.springanno.cap7")
public class Cap7MainConfig {
    //    @Scope("prototype")
//    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Bean
    public Person person() {
        return new Person("admin", 18);
    }

//    @Bean
//    public Train train() {
//        return new Train();
//    }

}
