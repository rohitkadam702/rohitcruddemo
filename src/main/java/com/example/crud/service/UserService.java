package com.example.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.bean.User;
import com.example.crud.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repo;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		 repo.findAll().forEach(users::add);
		return users;
		
	}

	public void addUser(User user) {
      repo.save(user);
		
	}

	public void updateUser(String id, User user) {
		repo.save(user);
		
	}

	public void delete(String id) {
		repo.deleteById(id);
		
	}

}
