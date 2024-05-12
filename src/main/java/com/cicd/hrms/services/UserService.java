package com.cicd.hrms.services;


import com.cicd.hrms.entities.User;
import com.cicd.hrms.repository.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	} 

	public User createUser(User user) {
		return userDao.save(user);
	}

	public List<User> getAllUser() {
		return userDao.findAll();
	}

	public User getUserById(Integer userId) {
		return userDao.findById(userId).orElse(null);
	}

	public void deleteUserById(Integer userId) {
		try {
			userDao.deleteById(userId);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public User updateUserById(User newUser, Integer userId) {
		User oldUser = userDao.findById(userId).orElse(null);
		
		oldUser.setName(newUser.getName());
		oldUser.setEmail(newUser.getEmail());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setPhone(newUser.getPhone());
		oldUser.setDob(newUser.getDob());
		
		User updatedUser = oldUser;
		
		return userDao.save(updatedUser);
	}
}
