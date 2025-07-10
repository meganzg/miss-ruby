package com.gfg.miss_ruby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {
    @GetMapping("/status")
    public String getStatus() {
        return "Miss Ruby backend is running";
    }
}
