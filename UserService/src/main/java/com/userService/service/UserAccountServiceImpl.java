package com.userService.service;

import com.userService.model.UserAccountDetails;
import com.userService.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserAccountServiceImpl implements UserAccountService{
    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserAccountDetails userCreate(UserAccountDetails userDetails) {
        return userAccountRepository.save(userDetails);
    }
    @Override
    public UserAccountDetails getUserById(String userEmail) {
        Optional<UserAccountDetails> optionalUser = userAccountRepository.findById(userEmail);
        return optionalUser.get();
    }

    @Override
    public UserAccountDetails userUpdate(UserAccountDetails userDetails) {
        UserAccountDetails existingUser = userAccountRepository.findById(userDetails.getEmail()).get();
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setName(userDetails.getEmail());
        existingUser.setPassword(userDetails.getPassword());

        UserAccountDetails updatedUser = userAccountRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void userDelete(String userEmail) {
        userAccountRepository.deleteById(userEmail);
    }
}
