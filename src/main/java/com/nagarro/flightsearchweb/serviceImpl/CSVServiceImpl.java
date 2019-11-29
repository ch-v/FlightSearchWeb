package com.nagarro.flightsearchweb.serviceImpl;

import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearchweb.constant.Constants;
import com.nagarro.flightsearchweb.dao.FlightDao;
import com.nagarro.flightsearchweb.entity.Flight;
import com.nagarro.flightsearchweb.service.CSVService;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author vishalchaudhary01
 *
 */
@Component
public class CSVServiceImpl implements CSVService {
	@Autowired
	FlightDao flightDao;

	@Scheduled(fixedDelay = 1000)
	public void fileRead() {
		File files[] = Constants.FILE.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (!Constants.FILENAME.contains(files[i].getName())) {
				Constants.FILENAME.add(files[i].getName());
				try (CSVReader r = new CSVReader(new FileReader(files[i]), Constants.DELIMETER, '"', 1)) {
					List<String[]> allRows = r.readAll();
					for (String[] row : allRows) {
						Flight flightDetail = getDetails(row);
						flightDao.addFlight(flightDetail);
					}
				} catch (Exception E) {
					System.err.print("Something wrong");
				}
			}
		}
	}

	private Flight getDetails(String[] row) {
		Flight f = new Flight();
		f.setFlightNo(row[0]);
		f.setDepLoc(row[1]);
		f.setArrLoc(row[2]);
		Date date = new Date();
		try {
			date = Constants.DATEFORMAT.parse(row[3]);
			f.setValidTill(date);
		} catch (ParseException e) {
			System.err.print("Date format incorrect");
		}
		f.setFlightTime(row[4]);
		f.setFlightDuration(Double.parseDouble(row[5]));
		f.setFare(Integer.parseInt(row[6]));
		boolean seatAvail = row[7].charAt(0) == 'Y' ? true : false;
		f.setSeatAvailability(seatAvail);
		f.setFlightClass(row[8]);
		return f;
	}

}
