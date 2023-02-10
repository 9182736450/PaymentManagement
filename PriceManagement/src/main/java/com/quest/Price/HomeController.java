package com.quest.Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.quest.Price.models.User;
import com.quest.Price.repositories.UserRepositories;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepositories repo;
	
	@GetMapping("/books")
	public String ShowBooksPage() {
		
		return "books";
	}
	@GetMapping("/buybooks")
	public String ShowPaymentPage() {
		return "buybooks";
	}
	
	@PostMapping("/userdetails")
	public String adduser(@ModelAttribute User user) {
		repo.save(user);
		 return "/books";
		 	
	}
	
}