package com.example.PasswordGenerate.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.PasswordGenerate.entity.Password;

public interface PasswordRepository extends CrudRepository<Password, Integer>{

}
