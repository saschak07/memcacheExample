package com.example.demo.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDataRepository;

@Component
public class DataLoader {

	@Autowired
	private UserDataRepository userDataRepository;
	
	@PostConstruct
	public void loadData() {
		List<UserDetails> userDetailsList = getUserList();
		userDataRepository.saveAll(userDetailsList);
	}

	private List<UserDetails> getUserList() {
		List<UserDetails> userList = new ArrayList<>();
		userList.add(new UserDetails("hojapani", "agoda"));
		userList.add(new UserDetails("saswata", "bangalore"));
		return userList;
	}
}
