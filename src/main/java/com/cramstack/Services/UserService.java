package com.cramstack.Services;

import org.springframework.stereotype.Service;

import com.cramstack.Entities.User;
import com.cramstack.Repository.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	} 

	public User createUser(User user) {
		return userDao.save(user);
	}
}
