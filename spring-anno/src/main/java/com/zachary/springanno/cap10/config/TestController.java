package com.zachary.springanno.cap10.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    public void println() {
        System.out.println(testService);
    }
}
