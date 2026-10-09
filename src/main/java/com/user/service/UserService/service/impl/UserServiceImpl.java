package com.user.service.UserService.service.impl;

import com.user.service.UserService.entities.User;
import com.user.service.UserService.entities.exception.ResourceNotFoundException;
import com.user.service.UserService.repositories.UserRepository;
import com.user.service.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        String randomUserID = UUID.randomUUID().toString();
        user.setUserId(randomUserID);

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User is not found"+userId));
    }

    @Override
    public User deleteById(String userId) {
        return null;
    }

    @Override
    public User updateById(String userId, User user) {
        return null;
    }
}
