package com.zachary.springanno.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/22
 **/
public class LinuxCondition implements Condition {
    /**
     * @param conditionContext      判断条件能使用的上下文信息（环境）
     * @param annotatedTypeMetadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取spring ioc 使用的beanFactory
        ConfigurableListableBeanFactory factory = conditionContext.getBeanFactory();
        //        获取类加载
        ClassLoader classLoader = conditionContext.getClassLoader();
        //        获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //        获取bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("linux")) {
            return true;
        }
        return false;
    }
}
