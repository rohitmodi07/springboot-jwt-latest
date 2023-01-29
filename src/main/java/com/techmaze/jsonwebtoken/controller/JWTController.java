package com.techmaze.jsonwebtoken.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmaze.jsonwebtoken.service.JWTService;


@RestController
public class JWTController {
	
	@Autowired
	private JWTService service;
	
	public JWTController(JWTService service) {
		this.service = service;
	}
	
	@GetMapping("/dish")
	public List<String> display() {
		return service.getValues();
	}

}
