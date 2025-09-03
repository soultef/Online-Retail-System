package com.soultech.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(String username, String password)
    {
        return "success for failer";
    }

    @PostMapping("/logout")
    public String logout()
    {
        return "success for failer";
    }

    @PostMapping("/refresh-token")
    public String refresh_token()
    {
        return "Refresh token";
    }

    @GetMapping("/user")
    public String currentUser()
    {
        return "Current user";
    }

}
