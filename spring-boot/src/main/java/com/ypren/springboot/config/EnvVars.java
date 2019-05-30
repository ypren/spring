package com.ypren.springboot.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Usage of spring property configuration.
 */
@Component
public class EnvVars {

    @Value("#{'${param.folders}'.split(',')}")
    private List<String> folders;

    public List<String> getFolders() {
        return folders;
    }
}
