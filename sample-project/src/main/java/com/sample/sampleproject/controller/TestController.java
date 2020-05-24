package com.sample.sampleproject.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping()
    public String testApi() {
        return "Hello world";
    }

    @GetMapping("/test2")
    public String test2Api() {
        return "Hello world 2";
    }
}
