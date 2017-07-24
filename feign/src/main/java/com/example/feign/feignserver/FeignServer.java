package com.example.feign.feignserver;

import com.example.feign.fallback.FeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SONG on 2017/7/20.
 */
@FeignClient(value = "client" , fallback = FeignFallback.class)
public interface FeignServer {

    @RequestMapping(value = "/get/{id}" , method = RequestMethod.GET)
    String getClient(@PathVariable("id") Integer id);

}
