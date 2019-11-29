package com.nagarro.flightsearchweb.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vishalchaudhary01
 *
 */
@Entity
public class Flight {
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", depLoc=" + depLoc + ", arrLoc=" + arrLoc + ", validTill=" + validTill
				+ ", flightTime=" + flightTime + ", flightDuration=" + flightDuration + ", fare=" + fare
				+ ", seatAvailability=" + seatAvailability + ", flightClass=" + flightClass + "]";
	}

	@Id
	@GeneratedValue
	int id;
	String flightNo;
	String depLoc;
	String arrLoc;
	Date validTill;
	String flightTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	Double flightDuration;
	int fare;
	boolean seatAvailability;
	String flightClass;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public Double getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(Double flightDuration) {
		this.flightDuration = flightDuration;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public boolean isSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(boolean seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

}
