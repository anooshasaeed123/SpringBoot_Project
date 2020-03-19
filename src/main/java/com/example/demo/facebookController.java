package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.signupRepo;

@Controller
public class facebookController {
	@Autowired
	private signupRepo repo;

@RequestMapping("/welcome")
public String welcome() {
	return "Welcome";
}
@RequestMapping("/signup")
public String welco() {
	return "signup";
}
}
