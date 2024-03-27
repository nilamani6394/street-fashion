package io.nilmani.streetfashion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/nilmani")
public class HomeController {
	
	@GetMapping("/indexPage")
	public String getHomePageIndex() {
		return "index";
	}

}
