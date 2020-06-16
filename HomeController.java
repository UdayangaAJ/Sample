package com.nt.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@Controller
public class HomeController {

	@Autowired
	EmpService service;

	@GetMapping(value = "/")
	public String registerForm() {
		return "register";
	}

	@GetMapping("/register")
	public String register(@ModelAttribute Employee e, Model model) {
		boolean isAdded = service.add(e);
		if (isAdded)
			model.addAttribute("msg", "Registration successful");
		else
			model.addAttribute("msg", "unable to resgistration");
		return "home";
	}
}
