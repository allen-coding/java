package com.allen.svc.controller;

import com.allen.svc.service.MybatisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Resource
    private MybatisService mybatisService;

    @GetMapping
    public ResponseEntity testMybatis() {
        return ResponseEntity.ok(mybatisService.testMybatis());
    }

    @GetMapping("/redis")
    public ResponseEntity testRedis() {
        return ResponseEntity.ok(mybatisService.testRedis());
    }
}
