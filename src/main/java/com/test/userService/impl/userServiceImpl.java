package com.test.userService.impl;

import org.springframework.stereotype.Service;

import com.test.entity.user;
import com.test.userRepo.userRepo;
import com.test.userService.userService;
import java.util.List;

@Service
public class userServiceImpl implements userService{

    private userRepo userRepo;

    public userServiceImpl(userRepo userRepo) {
        super();
        this.userRepo = userRepo;

    }
    
    @Override
    public List<user> getAllUsers(){
        return userRepo.findAll();

    }

    @Override
    public user saveUser(user user) {
        return userRepo.save(user);
    }

    @Override
    public user getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public user updateUser(user user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }


    
}
