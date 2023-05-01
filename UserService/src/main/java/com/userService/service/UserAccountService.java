package com.userService.service;

import com.userService.model.UserAccountDetails;

public interface UserAccountService {

    public UserAccountDetails userCreate(UserAccountDetails userDetails);

    public UserAccountDetails getUserById(String userEmail);

    public UserAccountDetails userUpdate(UserAccountDetails userDetails);

    public void userDelete(String userEmail);
}
