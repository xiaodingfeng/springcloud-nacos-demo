package com.xiaobai.nacosconsume;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "nacos-server")
public interface FeignTest {

    @PostMapping("/hello")
    String hello();
}
