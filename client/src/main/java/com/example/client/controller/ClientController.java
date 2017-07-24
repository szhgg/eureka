package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SONG on 2017/7/20.
 */
@RestController
public class ClientController {

    @GetMapping("/get/{id}")
    public String getClient(@PathVariable Integer id){
        return id + "..." + id;
    }

}
