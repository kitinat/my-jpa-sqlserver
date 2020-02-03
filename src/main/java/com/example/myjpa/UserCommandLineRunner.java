package com.example.myjpa;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.myjpa.entity.User;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;
	
	private static final Logger logger = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Kitinat","Admin");
		repo.save(user);
		
		user = new User("Chantee","Admin");
		repo.save(user);
		
		
		List<User> list = repo.findAll();
		for (User obj : list) {
			logger.debug("1.get=>{}",obj);
		}
		
		List<User> list2 = repo.findByNameAndRole("Kitinat", "Admin");
		for (User obj : list2) {
			logger.debug("2.get=>{}",obj);
		}
		
		Optional<User> u1 = repo.findById(1L);
		logger.debug("3.get=>{}",u1.get());
		
		repo.deleteById(99L);
		
		List<User> list3 = repo.findAll();
		logger.debug("4.get");
		for (User obj : list3) {
			logger.debug("4.get=>{}",obj);
		}
	}

}
