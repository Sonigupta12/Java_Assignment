package org.nagarro.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nagarro.constants.Constants;
import org.nagarro.model.User;
import org.nagarro.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public ModelAndView user() {
		ModelAndView mv = new ModelAndView(Constants.LOGIN);
		mv.addObject(Constants.USER, new User());
		return mv;
	}

	@PostMapping("/")
	public String login(@ModelAttribute(Constants.USER) User user) {

		User userData = loginService.login(user.getUsername(), user.getPassword());

		if (Objects.nonNull(userData)) {

			return Constants.HOME_REDIRECT;

		} else {
			return Constants.REDIRECT;

		}

	}

	@RequestMapping(value = { Constants.LOGOUT }, method = RequestMethod.POST)
	public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
		return Constants.REDIRECT;
	}

}
