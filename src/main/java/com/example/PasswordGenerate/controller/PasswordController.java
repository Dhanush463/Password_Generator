package com.example.PasswordGenerate.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PasswordGenerate.entity.Password;
import com.example.PasswordGenerate.service.PasswordService;


@RestController
@RequestMapping( "/passwordCreate" )
@CrossOrigin
public class PasswordController {
    @Autowired
    private PasswordService passwordService;
    
    @CrossOrigin
    @PostMapping("/create")
    public Password getNewPassowrd(@RequestBody Password password) {
    	return passwordService.getNewPassword(password);
    }
    @GetMapping("/hi")
    public String get() {
    	return "Hello World";
    }
    
    private String generatePassword(String firstName, String middleName, String lastName) {
        String password = firstName.substring(0, 2) + middleName.substring(0, 2) + lastName.substring(0, 2)
            + String.format("%03d", new Random().nextInt(1000));
        return password;
    }
}

