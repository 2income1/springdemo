package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String helloWorld() {
		return "niubile spring!";
	}

	@GetMapping("/getUser") // 映射
	public User queryUserById(@RequestParam("id") int id) {
		return userService.queryUserById(id);
	}

	@GetMapping("/addUser") // 映射
	public int addUser(@RequestParam("name") String name, @RequestParam("pass") String pass) {
		return userService.addUser(name, pass);
	}

	@GetMapping("/deleteUser") // 映射
	public int deleteUser(@RequestParam("name") String name) {
		return userService.deleteUser(name);
	}

	@GetMapping("/alterUser") // 映射
	public int alterUser(@RequestParam("name") String name, @RequestParam("pass") String pass) {
		return userService.alterUser(name, pass);
	}

}
