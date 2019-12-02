package com.example.demo;

import java.util.Objects;

public class LoginRequest {
	
	private String username;
	private String password;
	public LoginRequest (String username, String password) {
		this.username= username;
		this.password= password;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if(!(obj instanceof LoginRequest)) {
			return false;
		}
		LoginRequest other=(LoginRequest)obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "LoginRequest [username=" + username + ", password=" + password + "]";
	}
}
