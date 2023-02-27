package com.main.YemekPayCaseStudy.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessException {

    public String handleException(Exception e ) {
        return "-------------->" + e.getMessage();
    }
}
