package com.danilodantas.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("msnBemVindo", "Bem-vindo à biblioteca");
		return "publica-index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
