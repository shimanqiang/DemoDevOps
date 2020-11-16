package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Created by aoguang on 2020/11/16
 */
@Controller
@RequestMapping("/welcome")
public class WelComeController {

    @ResponseBody
    @GetMapping("/hi")
    public String hi() {
        return "hi, boy !!";
    }
}
