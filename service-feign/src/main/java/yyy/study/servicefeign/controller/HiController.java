package yyy.study.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yyy.study.servicefeign.service.SchedualServiceHi;

/**
 * Created on 2018/10/24
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "yyy") String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
