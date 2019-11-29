package com.nagarro.flightsearchweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flightsearchweb.entity.Flight;
import com.nagarro.flightsearchweb.entity.User;
import com.nagarro.flightsearchweb.serviceImpl.FlightServiceImpl;

/**
 * @author vishalchaudhary01
 *
 */
@Controller
public class AppController {
	@Autowired
	FlightServiceImpl flightService;
	List<Flight> result;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView add(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		flightService.fileRead();
		User user = flightService.getUser(username);
		System.out.println(user);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				result = null;
				mv.addObject("username", username);
				mv.addObject("lists", result);
				mv.addObject("username", user.getUserName());
				mv.setViewName("dashboard");
			}
		} else {
			mv.setViewName("login");

		}

		return mv;
	}

	@RequestMapping("/signup")
	public ModelAndView addUser(@RequestParam("username") String username, @RequestParam("email") String email,
			@RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();

		flightService.addUser(username, email, password);
		mv.setViewName("login");

		return mv;

	}

	@RequestMapping("/dashboard")
	public ModelAndView showSearch(@RequestParam("source") String source, @RequestParam("dest") String destination,
			@RequestParam("class") String flightClass, @RequestParam("sort") String sortPreference,
			@RequestParam("date") String date, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Flight> result = flightService.flightSearch(destination, source, sortPreference, date, flightClass);
		mv.addObject("lists", result);
		return mv;
	}

}
