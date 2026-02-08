package com.adriane.usermanagement.service.impl;

import com.adriane.usermanagement.model.User;
import com.adriane.usermanagement.repository.UserRepository;
import com.adriane.usermanagement.repository.impl.UserRepositoryImpl;
import com.adriane.usermanagement.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}
