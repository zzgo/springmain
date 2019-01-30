package com.zachary.springanno.cap10;

import com.zachary.springanno.cap10.config.Cap10MainConfig;
import com.zachary.springanno.cap10.config.TestDao;
import com.zachary.springanno.cap10.config.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
public class Cap10MainTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(Cap10MainConfig.class);

        for (String name : anno.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        System.out.println("===========================");


        TestService testService = anno.getBean(TestService.class);
        testService.println();
        TestDao testDao = anno.getBean(TestDao.class);
        System.out.println(testDao);
        anno.close();
    }
}
