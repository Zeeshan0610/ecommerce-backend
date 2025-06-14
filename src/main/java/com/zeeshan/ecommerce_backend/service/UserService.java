package com.zeeshan.ecommerce_backend.service;

import com.zeeshan.ecommerce_backend.model.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
}
