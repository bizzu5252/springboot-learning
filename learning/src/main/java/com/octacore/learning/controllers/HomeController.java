package com.octacore.learning.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${app.version}")
    private String app_version;

    @GetMapping
    @RequestMapping("/")
    public Map getApp_version(){
        Map hashMap = new HashMap<String,String>();
        hashMap.put("app_version", app_version);
        return hashMap;
    }

}
