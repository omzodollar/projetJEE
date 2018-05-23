package com.example.demo.controllers;

import 	org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class pagesController {
	@GetMapping("/home")
	
	public String home(@RequestParam(required =false ,defaultValue="world") String name ,ModelMap modelMap) {
		
		modelMap.put("name", name);
		return "pages/home";
	}

}