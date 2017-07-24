package com.example.feign.controller;

import com.example.feign.feignserver.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SONG on 2017/7/20.
 */

@RestController
public class FeignController {

    @Autowired
    private FeignServer feignServer;

    @GetMapping("/get/{id}")
    public String getClient(@PathVariable Integer id){
        return feignServer.getClient(id);
    }

}
