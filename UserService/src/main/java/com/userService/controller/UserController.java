package com.userService.controller;

import com.userService.model.UserAccountDetails;
import com.userService.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserAccountService userAccountService;

    @PostMapping
    public ResponseEntity<UserAccountDetails> createUserAccount(@RequestBody UserAccountDetails userDetails){
        UserAccountDetails savedUser = userAccountService.userCreate(userDetails);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccountDetails> getEmpById(@PathVariable("email") String email){
        UserAccountDetails user = userAccountService.getUserById(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAccountDetails> updateUser(@PathVariable("email") String email,
                                               @RequestBody UserAccountDetails userDetails){
        userAccountService.getUserById(email);
        UserAccountDetails updatedUser = userAccountService.userUpdate(userDetails);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("email") String userEmail){
        userAccountService.userDelete(userEmail);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
