package com.example.demo.service;

import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDataRepository;
@Service 
@CacheConfig(cacheNames="users")
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDataRepository userRepositiry;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	@Cacheable
	public Optional<UserDetails> getUserDetails(String userName) {
		logger.info("reading details from database for user::"+userName);
		Optional<UserDetails> optionalUserDetails = userRepositiry.findByName(userName);
		return optionalUserDetails;
	}

}
