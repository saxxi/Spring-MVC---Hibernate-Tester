package com.aditsaxena.webapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	/**
	 * Simply selects the home view to render by returning its name.
	 */
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

}
