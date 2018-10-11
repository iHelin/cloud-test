package me.ianhe.cloud.feign.service.impl;

import me.ianhe.cloud.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Service;

/**
 * @author iHelin
 * @since 2018/7/18 21:32
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
