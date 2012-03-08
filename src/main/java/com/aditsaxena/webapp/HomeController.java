package com.aditsaxena.webapp;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aditsaxena.webapp.model.Post;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is " + locale.toString());

		// DATE
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		// SPRING BEANS TESTER
		ApplicationContext context = new ClassPathXmlApplicationContext("MySpringBeans.xml");
		Post thePost = (Post) context.getBean("post");
		
		//thePost.setTitle("ciao");
		
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("thePost", thePost);
		model.addAttribute("thePostTitle", thePost.getTitle() );
		model.addAttribute("theNViews", thePost.getnViews() );
		
		return "home";
	}

	@RequestMapping(value = "/hello/my/dear", method = RequestMethod.GET)
	public String hello(Locale locale, Model model) {
		
		return "hello/dear";
	}

	@RequestMapping(value = "/hello/supa/secret/page", method = RequestMethod.GET)
	public String supaSecret(Locale locale, Model model, Principal principal) {
		
		// METHOD 1) SecurityContextHolder + Authentication.getName()
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String authUsername = auth.getName();
		
		
		// METHOD 2) SecurityContextHolder + User.getUsername()
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    String UserUsername = user.getUsername(); //get logged in username
	    
	    // METHOD 3) Principal, UsernamePasswordAuthenticationToken
	    // public String printWelcome(ModelMap model, Principal principal ) {
	    String principalUsername = principal.getName(); //get logged in username
	    
	    model.addAttribute("authUsername", authUsername);
		model.addAttribute("userUsername", UserUsername);
		model.addAttribute("principalUsername", principalUsername);
	    	
		return "hello/supaSecret";
	}
	
}
