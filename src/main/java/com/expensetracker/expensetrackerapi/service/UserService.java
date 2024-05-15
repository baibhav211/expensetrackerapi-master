package com.expensetracker.expensetrackerapi.service;

import com.expensetracker.expensetrackerapi.entity.User;
import com.expensetracker.expensetrackerapi.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}
