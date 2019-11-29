package com.nagarro.flightsearchweb.constant;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author vishalchaudhary01
 *
 */
public class Constants {

	public static final File FILE = new File("D:\\Assignment\\CsvFiles");
	public static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("dd-MM-yyyy");
	public static final char DELIMETER = '|';
	public static final ArrayList<String> FILENAME = new ArrayList<>();
	public static final String SELECT_FROM_FLIGHT = "select * from flight";
	public static final String WHERE_CONDITION_WITH_PREFERENCE = " where arrLoc = :arrLoc and depLoc = :depLoc and flightClass= :flightClass and validTill>=:date and seatAvailability=1 order by :preference asc ";
	public static final String WHERE_CONDITION_WITHOUT_PREFERENCE = " where arrLoc = :arrLoc and depLoc = :depLoc and flightClass= :flightClass and validTill>=:date and seatAvailability=1";
}
