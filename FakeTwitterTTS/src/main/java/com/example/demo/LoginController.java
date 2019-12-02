package com.example.demo;


import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {


	@GetMapping("/login")
	public String loginHome() {
		return "login";
	}
	@PostMapping(value="/login", consumes= {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ModelAndView postLogin(LoginRequest loginRequest, HttpSession session) {
		session.setAttribute("username", loginRequest.getUsername());
		return new ModelAndView("redirect:/main");
	}
}

