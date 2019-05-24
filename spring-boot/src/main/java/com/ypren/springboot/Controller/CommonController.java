package com.ypren.springboot.Controller;

import java.util.List;

import com.ypren.springboot.config.EnvVars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ypren on 2019/5/24.
 * The controller mainly used to place some common method.
 */
@RestController
public class CommonController {
    private static final String SPRING_BOOT_VERSION = "1.0";
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    private EnvVars envVars;

    public CommonController(EnvVars envVars) {
        this.envVars = envVars;
    }

    @GetMapping(value = "/version")
    public String version() {
        logger.info("Request version -> {}", SPRING_BOOT_VERSION);
        return SPRING_BOOT_VERSION;
    }

    @GetMapping(value = "/folders")
    public List<String> folders() {
        return envVars.getFolders();
    }
}
