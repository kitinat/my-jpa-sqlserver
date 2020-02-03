package com.example.myjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByNameAndRole(String name,String role);
	void deleteByRole(String role);
}
