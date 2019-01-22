package com.zachary.springanno.cap2.config;

import com.zachary.springanno.cap1.Person;
import com.zachary.springanno.cap2.controller.Cap2Controller;
import com.zachary.springanno.cap2.dao.Cap2Dao;
import com.zachary.springanno.cap2.service.Cap2Service;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @ComponentScan(value="com.enjoy.cap2",includeFilters={ @Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
 * @Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}) },useDefaultFilters=false)
 * //默认是true,扫描所有组件，要改成false,使用自定义扫描范围
 * @ComponentScan value:指定要扫描的包
 * excludeFilters=Filter[]指定扫描的时候按照什么规则排除那些组件
 * includeFilters=Filter[]指定扫描的时候只需要包含哪些组件
 * useDefaultFilters=false 默认是true,扫描所有组件，要改成false
 * －－－－扫描规则如下
 * FilterType.ANNOTATION：按照注解
 * FilterType.ASSIGNABLE_TYPE：按照给定的类型；比如按BookService类型
 * FilterType.ASPECTJ：使用ASPECTJ表达式
 * FilterType.REGEX：使用正则指定
 * FilterType.CUSTOM：使用自定义规则，自已写类，实现TypeFilter接口
 * <p>
 * <p>
 * FilterType.CUSTOM的例子,常用
 * @Date:2019/1/22
 **/

@Configurable
//自定义类来过滤规则
//@ComponentScan(value = "com.zachary.springanno.cap2",
//        includeFilters = {
//                @Filter(type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})
//        },
//        useDefaultFilters= false)

@ComponentScan(value = "com.zachary.springanno.cap2",
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                @Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Cap2Dao.class})
        },
        useDefaultFilters = false)
public class Cap2MainConfig {
    @Bean
    public Person person01() {
        return new Person("admin", 18);
    }
}
