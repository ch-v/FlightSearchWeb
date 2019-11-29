package com.nagarro.flightsearchweb.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearchweb.configuration.HibernateConfiguration;
import com.nagarro.flightsearchweb.dao.UserDao;
import com.nagarro.flightsearchweb.entity.User;

/**
 * @author vishalchaudhary01
 *
 */
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateConfiguration hc;

	public void addData(String username, String email, String password) {
		Session session = hc.getSession();
		Transaction tx = session.beginTransaction();
		User user = new User();

		user.setUserName(username);
		user.setEmail(email);
		user.setPassword(password);
		session.save(user);
		tx.commit();
	}

	public User getData(String username) {
		Session session = hc.getSession();
		if (username != null) {
			return (User) session.get(User.class, username);
		} else {
			return null;
		}
	}
}
