package org.nagarro.controller;

import java.text.ParseException;
import java.util.List;

import org.nagarro.constants.Constants;
import org.nagarro.model.Tshirt;
import org.nagarro.services.TshirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TshirtController {

	@Autowired
	private TshirtService tshirtService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView tshirtSearchPage() {
		return new ModelAndView(Constants.HOME);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(String colour, String size, String gender_recommendation, String sortingType)
			throws ParseException, ParseException {

		ModelAndView mv = new ModelAndView(Constants.RESULT);
		List<Tshirt> tshirts = tshirtService.searchTshirts(colour, size, gender_recommendation, sortingType);

		mv.addObject(Constants.TSHIRT, tshirts);

		return mv;
	}

}
