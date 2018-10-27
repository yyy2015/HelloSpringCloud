package yyy.study.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created on 2018/10/24
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
