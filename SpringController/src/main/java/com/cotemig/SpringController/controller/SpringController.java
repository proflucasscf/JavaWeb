package com.cotemig.SpringController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController extends BaseController {
	
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@GetMapping("/update")
	public String update() {
		return "update";
	}
	
	@GetMapping("/")
	public String menu() {
		return "menu";
	}
}
