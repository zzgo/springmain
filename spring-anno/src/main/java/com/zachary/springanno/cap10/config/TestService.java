package com.zachary.springanno.cap10.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @Author:Zachary
 * @Desc:
 * @Date:2019/1/24
 **/
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public void println() {
        System.out.println(testDao);
    }
}
