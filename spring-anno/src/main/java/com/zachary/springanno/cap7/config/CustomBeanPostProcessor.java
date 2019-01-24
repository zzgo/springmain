package com.zachary.springanno.cap7.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/23 <p>
 * BeanPostProcessor类[interface]: bean的后 置处理器,在bean初始化之前调用进行拦截,作用:在bean初始化前后进行一些处理工作, 打开此类
 * </p>
 * <p>
 * a> postProcessBeforeInitialization():在初始化之前进行后置处理工作(在init-method之前),
 * </p>
 * 什么时候调用:它任何初始化方法调用之前(比如在InitializingBean的afterPropertiesSet初始化之前,或自定义init-method调用之前使用)
 * <p>
 * b> postProcessAfterInitialization():在初始化之后进行后置处理工作, 比如在InitializingBean的afterPropertiesSet()
 * </p>
 * 执行顺序 Construct -- postProcessBeforeInitialization -- init --- postProcessAfterInitialization -- destroy
 **/
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    //    这个方法在初始化之前调用
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "CustomBeanPostProcessor 1");
        return bean;
    }

    //这个方法在初始化之后调用
    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "CustomBeanPostProcessor 2");
        return bean;
    }
}
