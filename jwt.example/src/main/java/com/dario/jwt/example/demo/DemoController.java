package com.dario.jwt.example.demo;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name = "Bearer Authentication")
@RequestMapping("/api/v1/demo-controller")
public class DemoController {


    @GetMapping("/administrator")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello Administrator from secured End Point");
    }

    @GetMapping("/user")
    public ResponseEntity<String> sayGoodbay(){
        return ResponseEntity.ok("Hello USER from secured End Point");
    }
}
