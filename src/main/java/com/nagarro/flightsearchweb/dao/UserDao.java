package com.nagarro.flightsearchweb.dao;

import com.nagarro.flightsearchweb.entity.User;

/**
 * @author vishalchaudhary01
 *
 */
public interface UserDao {

	public void addData(String username, String email, String password);

	public User getData(String username);

}
