package com.nagarro.flightsearchweb.dao;

import java.util.List;

import com.nagarro.flightsearchweb.entity.Flight;

/**
 * @author vishalchaudhary01
 *
 */
public interface FlightDao {

	public void addFlight(Flight flight);

	public List<Flight> getFlight(String arrLoc, String depLoc, String preference, String date, String flightClass);

}
