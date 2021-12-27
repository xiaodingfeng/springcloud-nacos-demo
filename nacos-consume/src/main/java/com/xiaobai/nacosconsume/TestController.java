package com.xiaobai.nacosconsume;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    FeignTest feignTest;

    @GetMapping("/hello")
    public String hello() {
        return feignTest.hello();
    }

    @GetMapping("/")
    public String index() {
        return "index!";
    }
}
