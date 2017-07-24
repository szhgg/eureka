package com.example.feign.fallback;

import com.example.feign.feignserver.FeignServer;
import org.springframework.stereotype.Component;

/**
 * Created by SONG on 2017/7/20.
 */
@Component
public class FeignFallback implements FeignServer {


    @Override
    public String getClient(Integer id) {
        return id + "Fallback";
    }
}
