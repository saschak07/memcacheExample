package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDetailsUpdateRequest;
import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserDetailsService;

@RestController
@RequestMapping(value = "/api/userDetailsService")
public class DemoController {
	
	@Autowired
	private UserDetailsService userService;

	@GetMapping(value = "/{userName}")
	public ResponseEntity<UserDetails> getUserDetails(@PathVariable String userName){
		Optional<UserDetails> optionalUserDetails = userService.getUserDetails(userName);
		return ResponseEntity.ok(optionalUserDetails.get());
	}
	@PutMapping(value = "/{userName}")
	public ResponseEntity<UserDetails> putUserDetails(@PathVariable String userName,
			@RequestBody UserDetailsUpdateRequest userUpdateRequest){
		Optional<UserDetails> optionalUserDetails = userService.updateUserDetails(userName, userUpdateRequest);
		return ResponseEntity.ok(optionalUserDetails.get());
	}
}
