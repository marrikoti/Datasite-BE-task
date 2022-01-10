package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Refrance;
import com.app.service.UserService;

@RestController
public class UserController {

@Autowired
 public UserService us;
 
@GetMapping("/getusers")
 public Refrance getUsers() {
	Refrance userData= us.getUsers();
	return userData;
 }



}
