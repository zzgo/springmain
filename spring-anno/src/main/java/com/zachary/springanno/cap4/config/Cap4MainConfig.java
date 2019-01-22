package com.zachary.springanno.cap4.config;

import com.zachary.springanno.cap1.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/

@Configurable
public class Cap4MainConfig {

    //jemes 老师的理解
    // 给容器中注册一个bean, 类型为返回值的类型, 默认是单实例
    /*
     * 懒加载: 主要针对单实例bean:默认在容器启动的时候创建对象
	 * 懒加载:容器启动时候不创建对象, 仅当第一次使用(获取)bean的时候才创建被初始化
	 */

    /**
     * 我的理解
     * 不加@Lazy 注解  对象实例在初始化spring IOC容器的时候就会被加载进去
     * 加上@Lazy注解  对象在被调用的时候才会被初始化 app.getBean(beanName)的时候才会被加载到spring IOC 容器中去
     */
//    @Lazy
    @Bean
    public Person person() {
        System.out.println("初始化调用...");
        return new Person("admin", 18);
    }
}
