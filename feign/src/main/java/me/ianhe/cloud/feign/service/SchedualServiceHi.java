package me.ianhe.cloud.feign.service;

import me.ianhe.cloud.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author iHelin
 * @since 2018/7/18 21:13
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    /**
     * @param name
     * @return
     */
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
