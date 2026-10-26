package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/leads")
	public String showLeads() {
		return "leads";
	}
	
	@GetMapping("/systems")
	public String showSystems() {
		return "system";
	}

}
