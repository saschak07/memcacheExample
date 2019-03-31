package com.example.demo.service;

import java.util.Optional;


import com.example.demo.entity.UserDetails;

public interface UserDetailsService {

	Optional<UserDetails> getUserDetails(String userName);

}
