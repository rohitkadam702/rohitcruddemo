package com.example.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crud.bean.User;

public interface UserRepository extends CrudRepository<User, String> {

}
