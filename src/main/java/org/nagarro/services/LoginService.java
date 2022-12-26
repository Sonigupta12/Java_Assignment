package org.nagarro.services;

import org.nagarro.dao.LoginDao;
import org.nagarro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public User login(String username, String password) {
		User user = loginDao.findByUsernameAndPassword(username, password);
		return user;
	}
}
