package com.nagarro.flightsearchweb.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearchweb.configuration.HibernateConfiguration;
import com.nagarro.flightsearchweb.constant.Constants;
import com.nagarro.flightsearchweb.dao.FlightDao;
import com.nagarro.flightsearchweb.entity.Flight;

/**
 * @author vishalchaudhary01
 *
 */
@Component
public class FlightDaoImpl implements FlightDao {
	@Autowired
	HibernateConfiguration hc;

	public void addFlight(Flight flight) {
		Session session = hc.getSession();
		Transaction tx = session.beginTransaction();
		session.save(flight);
		tx.commit();

	}

	@SuppressWarnings("unchecked")
	public List<Flight> getFlight(String arrLoc, String depLoc, String preference, String date, String flightClass) {
		Session session = hc.getSession();
		List<Flight> result;
		if (preference != null) {
			result = session.createSQLQuery(Constants.SELECT_FROM_FLIGHT + Constants.WHERE_CONDITION_WITH_PREFERENCE)
					.addEntity(Flight.class).setParameter("arrLoc", arrLoc).setParameter("depLoc", depLoc)
					.setParameter("flightClass", flightClass).setParameter("preference", preference)
					.setParameter("date", date).list();
		} else {
			result = session.createSQLQuery(Constants.SELECT_FROM_FLIGHT + Constants.WHERE_CONDITION_WITHOUT_PREFERENCE)
					.addEntity(Flight.class).setParameter("arrLoc", arrLoc).setParameter("depLoc", depLoc)
					.setParameter("flightClass", flightClass).setParameter("date", date).list();
		}
		System.out.println(result);
		return result;

	}

}
