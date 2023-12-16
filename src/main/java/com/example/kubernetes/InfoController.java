package com.example.kubernetes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {

    @GetMapping
    public String info() {
        return "kubentest-spring-mysql-demo";
    }

}
