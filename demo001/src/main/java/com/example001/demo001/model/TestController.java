package com.example001.demo001.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @RequestMapping("/hello")
    public Object hello() {
        return "2222";
    }
}
