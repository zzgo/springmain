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
public class WindowCondition implements Condition {
    /**
     * @param conditionContext      判断条件能使用的上下文信息（环境）
     * @param annotatedTypeMetadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取到spring ioc 使用的 beanFactory
        ConfigurableListableBeanFactory factory = conditionContext.getBeanFactory();
        //获得类加载
        ClassLoader loader = conditionContext.getClassLoader();
        //获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //获得bean的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        //
        String property = environment.getProperty("os.name");
        System.out.println(property);
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
