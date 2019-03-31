package com.example.demo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserDetails {
@Id
private String userIds = UUID.randomUUID().toString();
private String name;
private String address;
public String getUserIds() {
	return userIds;
}
public void setUserIds(String userIds) {
	this.userIds = userIds;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public UserDetails( String name, String address) {
	this.name = name;
	this.address = address;
}
public UserDetails() {
	super();
}


}
