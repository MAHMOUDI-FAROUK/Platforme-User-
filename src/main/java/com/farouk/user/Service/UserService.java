package com.farouk.user.Service;

import com.farouk.user.entity.User;

import java.util.List;

public interface UserService {
    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String userId);
    public User getUser (String userId);
    public List<User> getAllUser();
}
