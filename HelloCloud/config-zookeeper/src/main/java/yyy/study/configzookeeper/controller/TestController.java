package yyy.study.configzookeeper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/12/4
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String hi(){
        return foo;
    }
}
