
package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")    // url부분
    public String hello() {
        return "hello";   // → templates/hello.html을 렌더링
    }

    @GetMapping("/hidden-page")
    public String hiddenPage() {
        return "hidden-page";
    }
}