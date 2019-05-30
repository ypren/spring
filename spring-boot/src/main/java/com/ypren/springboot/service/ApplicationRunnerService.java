package com.ypren.springboot.service;

import com.ypren.springboot.model.User;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

/**
 * Test usage of ApplicationRunner.
 * @see ApplicationRunner
 * @see org.springframework.boot.CommandLineRunner
 */
@Slf4j
@Service
public class ApplicationRunnerService implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User.Builder()
                .name("ypren")
                .gender(User.Gender.MAN)
                .number("001")
                .build();
        log.info("test ApplicationRunner run");
        log.info("new manager {}", user);
    }
}
