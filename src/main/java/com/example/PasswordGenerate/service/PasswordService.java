package com.example.PasswordGenerate.service;

import java.util.List;

import com.example.PasswordGenerate.entity.Password;

public interface PasswordService {
	Password getNewPassword(Password pass);
}
