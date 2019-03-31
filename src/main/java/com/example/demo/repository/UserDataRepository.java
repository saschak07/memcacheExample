package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserDetails;

public interface UserDataRepository extends CrudRepository<UserDetails, String> {

 Optional<UserDetails> findByName(String name);
}
