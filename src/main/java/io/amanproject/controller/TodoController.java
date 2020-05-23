package io.amanproject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.amanproject.entity.Todo;
import io.amanproject.repository.TodoRepository;

@Controller
public class TodoController {

	@Autowired
	private TodoRepository todorepo;
	
	@PostMapping("/submitReview")
	public String addReview(@ModelAttribute("review") Todo review, Model model) {
		todorepo.save(review);
		model.addAttribute("status", "Your Todo is submitted successfully");
		return "home";
	}

	@GetMapping("/getReviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", todorepo.findAll());
		return "results";
	}
	
	@GetMapping("/addReview")
	public String adsd(){
		return "review";
	}
	
	
}
