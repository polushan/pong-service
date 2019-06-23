package com.pingpong.pongservice.web;


import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/pong")
public class PongController {

    @GetMapping
    public String pong() {
        log.info("pong");
        return "pong";
    }
}
