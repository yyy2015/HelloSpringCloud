package yyy.study.config.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/10/27
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${foo}")
    String foo;

    @GetMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
