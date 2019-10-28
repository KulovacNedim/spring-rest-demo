package dev.ned.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoRestController1 {

    @GetMapping("/")
    public String sayhello() {
        System.out.println("1111111111111111111111111");
        return "Hello World!";
    }
}
