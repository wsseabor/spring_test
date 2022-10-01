package com.test.userController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.userService.userService;

@RestController
public class userController {

    private userService userService;

    public userController(userService userService) {
        super();
        this.userService = userService;

    }

    @GetMapping("/users")
    public String listUsers(Model m) {
        m.addAttribute("users", userService.getAllUsers());
        return "users";
    }
    
}
