package com.aditsaxena.webapp;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aditsaxena.webapp.model.Product;

@Controller
public class FiveController {
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String productIndex(Locale locale, Model model, Principal principal) {
		
		Product prod = new Product();
		List<Product> products = prod.findProducts();
		
		model.addAttribute("pageTitle", "Hibernate");
		model.addAttribute("products", products);
		return "product/index";
	}
	
	// Create: products/new [GET]
	@RequestMapping(value = "/products/new", method = RequestMethod.GET)
	public String newProduct(Locale locale, Model model, Principal principal) {
		return "product/new";
	}
	
	@RequestMapping(value = "/products/new", method = RequestMethod.POST)
	public String createProduct(Locale locale, Model model, Principal principal) {
		
		System.out.println("Create product");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Product prod = new Product("superman", 33, new Date());
		
		session.save(prod);
		session.getTransaction().commit();
		
		return "redirect:/products";
	}
	
	
	// Retrieve: products/33 [GET]
	
	// Update: products/33/edit [GET]
	@RequestMapping(value = "/products/{id}/edit", method = RequestMethod.GET)
	public String editProduct(Locale locale, @PathVariable("id") Model model, Principal principal) {
		return "product/edit";
	}
	@RequestMapping(value = "/products/{id}/edit", method = RequestMethod.POST)
	public String updateProduct(Locale locale, @PathVariable("id") Model model, Principal principal) {
		return "product/edit";
	}
	
	// Delete: product/33/delete [POST]
	
}
