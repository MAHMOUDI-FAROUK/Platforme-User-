package com.farouk.user.exeption;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(String message) {
        super(message);
    }

    public UserNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
