package com.zachary.springanno.cap7.entiy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/23
 **/
@Component
public class Train implements InitializingBean, DisposableBean {
    public Train() {
        System.out.println("...Construct");
    }

    //容器创建时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("...init");
    }

    //容器销毁时调用
    @Override
    public void destroy() throws Exception {
        System.out.println("...destroy");
    }
}
