package com.example.PasswordGenerate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="passwordTable")
public class Password {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="middle_name")
	private String middelName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="password")
	private String password;

	
	
}
