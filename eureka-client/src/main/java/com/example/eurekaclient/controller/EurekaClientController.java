package com.example.eurekaclient.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    String index() {
        return "hello index";
    }

    @RequestMapping("/run")
    String run() {
        int firstValue = RandomUtils.nextInt(3);
        int secondValue = RandomUtils.nextInt(3);
        String summ =restTemplate.getForObject("http://calculator/calculate", String.class);
//        Integer summ =restTemplate.getForObject("http://calculator/calculate&firstValue=" + firstValue + "&secondValue=" + secondValue, Integer.class);

        return "result: " + summ;
//        return "result: " + firstValue * secondValue;
    }
}
