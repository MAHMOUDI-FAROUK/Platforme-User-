package com.farouk.user.exeption;

import org.springframework.http.HttpStatus;

public class UserExeption {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public UserExeption(String mesage, Throwable throwable, HttpStatus httpStatus) {
        this.message = mesage;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMesage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

