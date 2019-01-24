package com.zachary.springanno.cap6;

import com.zachary.springanno.cap6.config.Cap6MainConfig;
import com.zachary.springanno.cap6.config.CustomFactoryBean;
import com.zachary.springanno.cap6.entity.Monkey;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class Cap6MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        for (String name : app.getBeanDefinitionNames()) {
            System.out.println(name);
        }
/***
 *
 *
 * 测试用例里分析Object bean1 = anno.getBean("factoryBean");
 * 是Monkey还是CustomFactoryBean的实例bean呢,调试跟进getBean源码看看(可看第三节课的视频)
 发现实际是获取getObject创建的对象, 并不是CustomFactoryBean对象

 注:当声明Object bean1 = anno.getBean("&factoryBean");, 获取到的bean为CustomFactoryBean对象, 也可跟进源码分析看看
 *
 */
/*
        CustomFactoryBean factoryBean = (CustomFactoryBean) app.getBean("&factoryBean");
        System.out.println(factoryBean.getName());
//print factoryBean
        Monkey monkey = (Monkey) app.getBean("factoryBean");
        System.out.println(monkey.getName());
// print        monkey
*/
    }
}
