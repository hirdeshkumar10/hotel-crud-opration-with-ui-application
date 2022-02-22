package com.sunglowsys.web;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
