package com.example.PasswordGenerate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PasswordGenerate.entity.Password;
import com.example.PasswordGenerate.repository.PasswordRepository;


@Service
public class PasswordServiceMySQL implements PasswordService{
	@Autowired
	private PasswordRepository passwordRepository;
	@Override
	public Password getNewPassword(Password pass) {
		return passwordRepository.save(pass);
	}
}
