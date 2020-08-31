package com.Ahsan.Employees.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	
	
	
	
	
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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "user [Username=" + username + ", password=" + password + ", id=" + id + "]";
	}

	
	
	
}


