package com.nagarro.flightsearchweb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vishalchaudhary01
 *
 */
@Entity
public class User {
	@Id
	private String userName;
	private String email;
	private String password;

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + ", imageList=" + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
