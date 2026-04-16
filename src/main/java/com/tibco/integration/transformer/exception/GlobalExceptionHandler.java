package com.tibco.integration.transformer.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    //this method will handle: All exceptions (Exception.class = generic)
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handlerError(Exception e)
    {
        log.error("Error Occurred !"+e.getMessage());

        // Return HTTP 400
        return ResponseEntity
                .badRequest()
                .body("Invalid Input format ! "+e.getMessage());
    }

}
