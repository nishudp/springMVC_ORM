package com.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.UserDao;
import com.springMVC.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;   //IOC container know that i have to create object of this through @Repository annotation in DAO class
	public int saveUser(User user) {
		int i = userDao.save(user);
		
		return i;
	}

}
