package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Work;
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
public String submitwork(@RequestParam("title") String title, @RequestParam("company")
String company, @RequestParam("sDate") String sDate, @RequestParam("eDate") String eDate) {

Work work = new Work(title,company,sDate,eDate);
repo.save(work);
return "EditProfile";
	  
}

@RequestMapping(path = "profile/{id}")
public String getProfile(@PathVariable("id") int id,ModelMap map) {
	
 Work work = repo.findById(id).orElse(null);
 map.addAttribute("company",work.getCompany()).addAttribute("title",work.getTitle()).addAttribute("sDate", work.getStartDate()).addAttribute("eDate",work.getEndDate());

 return "Profile";
 
}
}
