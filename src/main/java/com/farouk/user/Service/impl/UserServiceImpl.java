package com.farouk.user.Service.impl;

import com.farouk.user.Service.UserService;
import com.farouk.user.entity.User;
import com.farouk.user.exeption.UserNotFoundExeption;
import com.farouk.user.repository.UserReposirory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    UserReposirory userReposirory;

    public UserServiceImpl(UserReposirory userReposirory) {
        this.userReposirory = userReposirory;
    }

    @Override
    public String createUser(User user) {
        userReposirory.save(user);
        return "success";
    }

    @Override
    public String updateUser(User user) {
        userReposirory.save(user);
        return "success";
    }

    @Override
    public String deleteUser(String userId) {
        userReposirory.deleteById(userId);
        return "success";
    }

    @Override
    public User getUser(String userId) {
        if(userReposirory.findById(userId).isEmpty())
            throw new UserNotFoundExeption("Requested User Does Not Exist");

        return userReposirory.findById(userId).get();
    }

    @Override
    public List<User> getAllUser() {
        return userReposirory.findAll();
    }
}
