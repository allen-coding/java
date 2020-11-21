package com.allen.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/mvc")
    public ResponseEntity testMvc() {
        return ResponseEntity.ok("success");
    }


}
