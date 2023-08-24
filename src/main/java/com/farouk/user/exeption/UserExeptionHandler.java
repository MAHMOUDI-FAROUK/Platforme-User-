package com.farouk.user.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class UserExeptionHandler {
    @ExceptionHandler(value={UserNotFoundExeption.class})
    public ResponseEntity<Object> handleUserNotFoundExeption(UserNotFoundExeption userNotFoundExeption)
    {
        UserExeption userExeption=new UserExeption(userNotFoundExeption.getMessage(),userNotFoundExeption.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(userExeption, HttpStatus.NOT_FOUND);

    }

}
