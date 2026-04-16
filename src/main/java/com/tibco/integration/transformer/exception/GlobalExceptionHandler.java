package com.tibco.integration.transformer.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    //this method will handle: All exceptions (Exception.class = generic)

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handlerError(Exception e)
    {
        // Return HTTP 400
        return ResponseEntity
                .badRequest()
                .body("Invalid Input format ! "+e.getMessage());
    }

}
