package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.bean.User;
import com.example.crud.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/getUsers")
	public List<User> getAllUsers() {
	return	service.getAllUsers();
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/create")
	public void addUsers(@RequestBody User user) {
		service.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/create/{id}")
	public void updateUser(@PathVariable String id, @RequestBody User user) {
		service.updateUser(id,user); 
	}
	
	public void deleteUser(@PathVariable String id) {
		service.delete(id);
	}

}
