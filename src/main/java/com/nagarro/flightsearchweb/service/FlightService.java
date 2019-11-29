package com.nagarro.flightsearchweb.service;

import java.util.List;

import com.nagarro.flightsearchweb.entity.Flight;
import com.nagarro.flightsearchweb.entity.User;

/**
 * @author vishalchaudhary01
 *
 */
public interface FlightService {

	public List<Flight> flightSearch(String destination, String source, String sortPreference, String date,
			String flightClass);

	public void addUser(String username, String email, String password);

	public User getUser(String username);

	public void fileRead();

}
