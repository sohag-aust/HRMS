package com.cramstack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cramstack.Entities.User;
import com.cramstack.Services.UserService;

@RestController
public class AppController {
	
	private UserService userService;
	
	public AppController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/findUsers")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/findUsers/{userId}")
	public User getUserById(@PathVariable("userId") Integer userId) {
		return userService.getUserById(userId);
	}
}
