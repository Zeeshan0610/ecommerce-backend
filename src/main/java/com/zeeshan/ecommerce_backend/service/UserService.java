package com.zeeshan.ecommerce_backend.service;

import java.util.List;

import com.zeeshan.ecommerce_backend.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
