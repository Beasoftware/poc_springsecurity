package com.dev.springboot.security.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.dev.springboot.security.model.User;
import com.dev.springboot.security.repository.UserRepository;


@Controller

public class UserController {
	@Autowired
	UserRepository userRepository;

	@PostMapping("/userSave")
	public String insertUser(@RequestBody User user) {
		userRepository.save(user);
		return "Your recored is saved Succssfully !";

	}

	/// for adding multiple details
	@PostMapping("/multipleUserSave")
	public String insertUser(@RequestBody List<User> user) {
		userRepository.saveAll(user);
		return "Record is saved Succssfully !";

	}

	@GetMapping("/getAllUser")
	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}

	@GetMapping("/getByUserId/{userId}")
	public Optional<User> getUser(@PathVariable("userId") Long id) {
		return userRepository.findById(id);
	}

	@DeleteMapping("/deleteByUserId/{id}")
	public String delete(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "Deleted !!";
	}

}
