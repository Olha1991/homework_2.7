package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.SEE_OTHER)
public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException(String message){
        super(message);
    }
}
