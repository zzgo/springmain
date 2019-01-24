package com.zachary.springanno.cap6.config;

import com.zachary.springanno.cap6.entity.Monkey;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @Title:
 * @Author:Zachary
 * @Desc: 创建一个Spring定义的工厂bean
 * @Date:2019/1/22
 **/

/* 使用spring提供的FactoryBean(工厂bean)
        *   beans.factory.FatoryBean源码跟进去
        *     容器调用getObject()返回对象，把对象放到容器中；
        *     getObjectType()返回对象类型
        *     isSingleton()是否单例进行控制
        *     新建CustomFactoryBean实现FactoryBean
        *     在config里新建factoryBean()方法
        *     写完测试用例后:
        *       a,默认获取到的是工厂bean调用getObject创建的对象
        *       b,要获取工厂Bean本身,需要在id前加个  &factoryBean
*/


public class CustomFactoryBean implements FactoryBean<Monkey> {
    //    返回一个Monkey对象，这个对象会添加到容器中
    @Nullable
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    //是否是单例
//    true：这个bean是单实例，在容器中只会保存一份
//    false：每次获取都会创建一个新的bean
//    怎么创建，就是调用getObject()方法创建
    @Override
    public boolean isSingleton() {
        return true;
    }


    public String getName() {
        return "factoryBean";
    }
}
