package com.danilodantas.aula.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danilodantas.aula.service.I18nService;

@Controller
public class HomeController {

	@Autowired
	private I18nService i18nService;

	@GetMapping("/")
	public String index(Model model, Locale locale) {
		String msn = i18nService.buscarMensagem("index.welcome", locale);
		model.addAttribute("msnBemVindo", msn);
		return "publica-index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}

