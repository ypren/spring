package com.ypren.springboot.config;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@Slf4j
@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler({
            IllegalArgumentException.class, // general argument error
            MethodArgumentNotValidException.class, // jackson object validation failed in controller method
            MethodArgumentTypeMismatchException.class // argument type mismatch in controller method
    })
    public void badRequest(Exception e, HttpServletResponse response) throws IOException {
        log.error("bad request", e);
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
