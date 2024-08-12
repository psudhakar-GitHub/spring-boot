package com.cts.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getBat(Model model) {
		model.addAttribute("home", "VCY");
		return "home";
	}
}
