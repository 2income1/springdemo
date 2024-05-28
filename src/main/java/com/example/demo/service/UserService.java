package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Service("UserService")
public class UserService {

	@Autowired
	private UserDao userDao;

	public User queryUserById(Integer id) {
		return userDao.queryUserById(id);
	}

	public int addUser(String name, String pass) {
		return userDao.addUser(name, pass);
	}

	public int deleteUser(String name) {
		return userDao.deleteByUserName(name);
	}

	public int alterUser(String name, String pass) {
		return userDao.updateByUserName(name, pass);
	}
}
