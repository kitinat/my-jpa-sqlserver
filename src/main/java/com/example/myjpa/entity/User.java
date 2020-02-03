package com.example.myjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "tb_m_user")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
}
