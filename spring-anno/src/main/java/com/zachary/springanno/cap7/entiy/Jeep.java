package com.zachary.springanno.cap7.entiy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/23
 **/
@Component
public class Jeep {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 可以使用JSR250规则定义的(java规范)两个注解来实现
     *
     * @PostConstruct: 在Bean创建完成, 且属于赋值完成后进行初始化, 属于JDK规范的注解
     * @PreDestroy: 在bean将被移除之前进行通知, 在容器销毁之前进行清理工作
     */

    public Jeep() {
        System.out.println("jeep construct ...");
    }

    //Bean 创建完成，赋值完成，进行初始化，后执行
    @PostConstruct
    public void init() {
        System.out.println("jeep init ...");
    }

    //销毁时执行
    @PreDestroy
    public void destroy() {
        System.out.println("jeep destroy ...");
    }
}
