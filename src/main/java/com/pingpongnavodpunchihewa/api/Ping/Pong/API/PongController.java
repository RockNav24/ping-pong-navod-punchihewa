package com.pingpongnavodpunchihewa.api.Ping.Pong.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
