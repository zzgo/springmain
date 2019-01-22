package com.zachary.springanno.cap1;

import com.zachary.springanno.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc: 通过@Configurable 配置加载bean
 * @Date:2019/1/22
 **/
public class MainTest2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        //        修改bean的名称
        //        直接修改方法名称
        //        @Bean("你要修改的名称")

        String[] beanNames = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (String beanName : beanNames) {
            System.out.println(beanName);
            Person person = (Person) annotationConfigApplicationContext.getBean(beanName);
            System.out.println(person);
        }

    }
}
