package com.zachary.springanno.cap9;

import com.zachary.springanno.cap9.config.Cap9MainConfig;
import com.zachary.springanno.cap9.entity.Bird;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.text.Bidi;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
public class Cap9MainTest {

    /***
     * 三种初始化默认值的方式
     * 1.bean.xml中设置属性
     * 2.使用@Value在变量名上进行初始化，支持JSTL表达式#{值}  @Value("value") @Value("#{value}")
     * 3.使用配置文件*.properties 需要在@PropertySource(value="classpath:/*.properties") 加载到环境变量中
     * 使用@Value("${key}")进行赋值
     * @param args
     */

    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        for (String name : anno.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        Bird bird = anno.getBean(Bird.class);
        System.out.println(bird);
        //配置文件加载到环境变量中
        Environment environment = anno.getEnvironment();
        System.out.println(environment.getProperty("bird.color"));
        anno.close();
    }
}
