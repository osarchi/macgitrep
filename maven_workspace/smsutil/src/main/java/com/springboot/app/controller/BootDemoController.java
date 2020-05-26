package com.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WJ
 * @create 2020-05-26 8:38 下午
 */


@RestController
public class BootDemoController {

    @Autowired
    private Environment env;

    @RequestMapping("/send")
    public String send() {
        return env.getProperty("test");

    }

}
