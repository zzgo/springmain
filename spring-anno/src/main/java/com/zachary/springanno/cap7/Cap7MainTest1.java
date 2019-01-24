package com.zachary.springanno.cap7;

import com.zachary.springanno.cap7.config.Cap7MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class Cap7MainTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(Cap7MainConfig.class);

        /***
         * Notice:
         *
         * 如果这个Bean是单列的话 那么在初始化spirng ioc 容器的时候，执行所有bean的Construct initMethod
         *
         * destroyMethod 会在spring 容器关闭后执行 anno.close(); ---> 才会执行所有bean指定了的destroyMethod
         *
         * 如果是多例模式，只会执行 Construct --> initMethod ,spring ioc 容器关闭，不会执行destroyMethod
         *
         * 理解为:多例模式下,容器只负责初始化,但不会管理bean, 容器关闭不会调用销毁方法
         *
         */
        anno.close();

    }
}
