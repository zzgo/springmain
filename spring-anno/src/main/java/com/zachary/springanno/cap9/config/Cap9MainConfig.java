package com.zachary.springanno.cap9.config;

import com.zachary.springanno.cap9.entity.Bird;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
@PropertySource(value = "classpath:/config.properties")
@Configurable
public class Cap9MainConfig {
    @Bean
    public Bird bird() {
        return new Bird();
    }
}
