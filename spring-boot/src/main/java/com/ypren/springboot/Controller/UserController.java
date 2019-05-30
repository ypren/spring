package com.ypren.springboot.Controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Simple rest controller.
 */
@Slf4j
@RestController
public class UserController {

    private static final String VERSION = "0.1";

    @GetMapping(value = "/version")
    public String version() {
        log.info("request version -> {}", VERSION);
        return VERSION;
    }
}
