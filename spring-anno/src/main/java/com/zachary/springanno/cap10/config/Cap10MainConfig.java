package com.zachary.springanno.cap10.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
@Configurable
@ComponentScan(value = "com.zachary.springanno.cap10.config")
public class Cap10MainConfig {
}
