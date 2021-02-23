package com.example.oauth2_client1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Slxin
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication){
        System.out.println(authentication);
        return authentication;
    }
}
