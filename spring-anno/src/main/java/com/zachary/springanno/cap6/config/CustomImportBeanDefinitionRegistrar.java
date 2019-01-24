package com.zachary.springanno.cap6.config;

import com.zachary.springanno.cap6.entity.Tiger;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:自定义注册类，实现bean的注册
 * @Date:2019/1/22
 **/
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    //    AnnotationMetadata:当前类的注解信息
//	BeanDefinitionRegistry:BeanDefinition注册类
//    把所有需要的添加到容器中的bean
//    调用BeanDefinitionRegistry.registerBeanDefinition自定义手工注册进来
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean definition1 = beanDefinitionRegistry.containsBeanDefinition("com.zachary.springanno.cap6.entity.Cat");
        boolean definition2 = beanDefinitionRegistry.containsBeanDefinition("com.zachary.springanno.cap6.entity.Dog");
//       判断容器中是否有dog和cat组件，有的话，添加Tiger组件
        if (definition1 && definition2) {
//            以前的bean都是全类名，现在自定义bean名
//            跟进registerBefinition() ,第二个参数beanDefinition
//            锁定Bean的定义信息（Bean 的类型，bean的scope）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Tiger.class);
//            注册一个bean,bean名为custom_tiger
            beanDefinitionRegistry.registerBeanDefinition("custom_tiger", beanDefinition);
        }
    }
}
