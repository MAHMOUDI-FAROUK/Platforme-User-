package com.farouk.user.controller;

import com.farouk.user.Service.UserService;
import com.farouk.user.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userId}")
    public User getUserDetail(@PathVariable("userId") String userId)
    {
        return  userService.getUser(userId);
    }
    @GetMapping("/")
    public List<User> getAllUserDetail()
    {
        return  userService.getAllUser();
    }
    @PostMapping
    public String createUserDetail(@RequestBody User user)
    {
        userService.createUser(user);
        return "User Created Succssefully";
    }
    @PutMapping
    public String updateUserDetail (@RequestBody User user)
    {
        userService.updateUser(user);
        return "User Updated Succssefully";
    }
    @DeleteMapping("{userId}")
    public String deleteUserDetail(@PathVariable("userId") String userId)
    {
        userService.deleteUser(userId);
        return "user Deleted Successfully";

    }



}
