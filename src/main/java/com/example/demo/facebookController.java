package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Account;
import com.example.demo.model.Member;
import com.example.demo.model.Person;
import com.example.demo.repositories.signupRepo;

@Controller
public class facebookController {
@Autowired
private signupRepo repo;

@GetMapping
public List<Member> getMember(){
	return repo.findAll();
}



@RequestMapping("/welcome")
public String welcome() {
	return "Welcome";
}
@RequestMapping("/signup")
public String welco() {
	return "signup";
}
@RequestMapping("/newsignup")
public String signup(@RequestParam("name") String name, @RequestParam("email") String email,@RequestParam("password1") String password1,
		@RequestParam("password2") String password2, @RequestParam("gender") String gender,Model model) {
	
	//ModelAndView mv = new ModelAndView("Home");
	Account account = new Account("Active",email, password1);
    Person person = new Person(name);
	person.setAccount(account);
	
		Member member = new Member("2/3/4");
	member.setPerson(person);
	repo.save(member);
	model.addAttribute("name", name);
	return "Home";
    
}


}
