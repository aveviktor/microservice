package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Value("${eureka.instance.instance-id}")
    String appId;

    @RequestMapping(value = "/calculate")
    String calculate() {
        return appId;
    }
}
