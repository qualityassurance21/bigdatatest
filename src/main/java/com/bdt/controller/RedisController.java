package com.bdt.controller;

import com.bdt.entity.Operator;
import com.bdt.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;


    //http://localhost:8888/saveCity?cityName=北京&cityIntroduce=中国首都&cityId=1
    @GetMapping(value = "saveOperator")
    public String saveCity(String operator_id, String password, String telephone){
        Operator operator = new Operator();
        redisService.set(operator_id +"", operator);
        return "success";
    }

}
