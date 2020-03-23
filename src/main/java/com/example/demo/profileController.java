package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repositories.editProfileRepo;

@Controller
public class profileController {
	@Autowired
	editProfileRepo repo;

@RequestMapping("editprofile")
public String editprofile() {
	return "EditProfile";
}

@PostMapping("/submitwork")
public void submitwork(@RequestParam("title") String title, @RequestParam("company") String company, @RequestParam("startDate") String
		sDate, @RequestParam("endDate") String eDate) {
	

}
}
