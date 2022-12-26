package org.nagarro.services;

import java.text.ParseException;
import java.util.List;

import org.nagarro.constants.Constants;
import org.nagarro.dao.TshirtDao;
import org.nagarro.model.Tshirt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TshirtService {

	@Autowired
	private TshirtDao tshirtDao;

	public List<Tshirt> searchTshirts(String colour, String size, String gender_recommendation, String sortingType)
			throws ParseException {
		if (sortingType.equals(Constants.SORTING_CHOICE))
			sortingType = Constants.SORTING_CHOICE;
		return tshirtDao.searchTshirts(colour, size, gender_recommendation, sortingType);
	}

}
