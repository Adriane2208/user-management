package com.adriane.usermanagement.service;

import com.adriane.usermanagement.model.User;
import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
