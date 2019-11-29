package com.nagarro.flightsearchweb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearchweb.dao.FlightDao;
import com.nagarro.flightsearchweb.dao.UserDao;
import com.nagarro.flightsearchweb.entity.Flight;
import com.nagarro.flightsearchweb.entity.User;
import com.nagarro.flightsearchweb.service.FlightService;

/**
 * @author vishalchaudhary01
 *
 */
@Component
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightDao flightDao;
	@Autowired
	UserDao userDao;
	@Autowired
	CSVServiceImpl csvFileReader;

	public List<Flight> flightSearch(String destination, String source, String sortPreference, String date,
			String flightClass) {

		List<Flight> result = flightDao.getFlight(destination, source, sortPreference, date, flightClass);
		return result;

	}

	public void addUser(String username, String email, String password) {
		userDao.addData(username, email, password);
	}

	public User getUser(String username) {
		return userDao.getData(username);
	}

	public void fileRead() {
		csvFileReader.fileRead();
	}

}
