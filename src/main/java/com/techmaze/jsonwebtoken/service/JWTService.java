package com.techmaze.jsonwebtoken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techmaze.jsonwebtoken.connector.JWTConnector;


@Component
public class JWTService {
	
	@Autowired
	private JWTConnector jwtConnector;
	
	public JWTService(JWTConnector jwtConnector){
		this.jwtConnector = jwtConnector;
	}
	
	public List<String> getValues() {
		return jwtConnector.getEmployeeList();
	}

}
