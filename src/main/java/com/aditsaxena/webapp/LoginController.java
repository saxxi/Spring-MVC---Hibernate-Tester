package com.aditsaxena.webapp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/auth/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "auth/login";
	}
	
	@RequestMapping(value = "/auth/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		return "auth/login";
	}
	
	@RequestMapping(value = "/auth/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "auth/login";
	}
}