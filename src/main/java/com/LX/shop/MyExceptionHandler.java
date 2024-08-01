package com.LX.shop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class MyExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity<String> errorHandler(){
            return ResponseEntity.status(400).body("에러다");
        }
}
