package com.userService.service;

import com.userService.model.User;
import com.userService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Cacheable(value = "users", key = "#email")
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @CacheEvict(value = "users", key = "#email")
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @CacheEvict(value = "users", key = "#email")
    public void deleteUserByEmail(String email) {
        userRepository.delete(getUserByEmail(email));
    }
}