package com.user.service.UserService.service;

import com.user.service.UserService.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUserById(String userId);
    User deleteById(String userId);
    User updateById(String userId,User user);
}
