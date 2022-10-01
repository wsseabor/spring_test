package com.test.userService;

import java.util.List;

import com.test.entity.user;

public interface userService {

    //Retrives all current users as a list, returns java.util.list object
    List<user> getAllUsers();

    //Saves new user into DB
    user saveUser(user user);

    //Calls user by id
    user getUserById(Long id);

    //Updates user
    user updateUser(user user);

    //Deletes user, does not return any object hence void
    void deleteUserById(Long id);
    
}
