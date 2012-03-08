package com.aditsaxena.webapp;

import java.security.Principal;
import java.util.Date;
import java.util.Locale;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aditsaxena.webapp.model.Product;

@Controller
public class FiveController {

	
	@RequestMapping(value = "/high-five", method = RequestMethod.GET)
	public String highFive(Locale locale, Model model, Principal principal) {
		
		System.out.println("Maven + Spring MVC + Hibernate + Mysql");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		Product prod = new Product("superman", 33, new Date());
		
		session.save(prod);
		session.getTransaction().commit();
		
		
		model.addAttribute("pageTitle", "Hibernate");
		return "hello/highFive";
	}
	
}
