package com.example.batch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.batch.model.UserDetails;
import com.example.batch.repository.UserRepo;

@RestController
public class Controller {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	
public void saveUser(@RequestBody UserDetails userDetails) {
		
		userRepo.save(userDetails);
		}

}
