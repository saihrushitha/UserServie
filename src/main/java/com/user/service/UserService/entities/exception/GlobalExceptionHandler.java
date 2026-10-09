package com.user.service.UserService.entities.exception;

import com.user.service.UserService.entities.exception.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //so we are just sayinf whenever resourcenotfound =exception comes this class will catch it the main reasom=n for exceptionhandler below
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(
            ResourceNotFoundException ex) {

        String msg = ex.getMessage();

        ApiResponse response = new ApiResponse(
                msg,
                false,
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}