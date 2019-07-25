package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    /**
     * 日志上下文
     **/
    private static final Logger log1 = LoggerFactory.getLogger("mytest");

    private static final Logger log2 = LoggerFactory.getLogger("mytest2");

    private static final Logger log3 = LoggerFactory.getLogger("mytest3");


    @RequestMapping("/logback")
    public String logbackDemo() {
        log1.info("test mytest1");
        log2.info("test mytest2");
        log3.info("test mytest3");
        return "hello";
    }
}
