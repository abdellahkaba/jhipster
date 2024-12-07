package com.isi.ms1.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("/v1/helloworld")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World ms1 version v1");
    }

    @GetMapping("/v2/helloworld")
    public ResponseEntity<String> helloWorld2() {
        return ResponseEntity.ok("Hello World ms1 version v2");
    }


}
