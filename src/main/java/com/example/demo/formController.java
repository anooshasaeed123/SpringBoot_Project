package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class formController {
@Autowired
CustomersRepo repo;


@RequestMapping("/")
public String details(){
	
	return "Customers";
	
}

@RequestMapping("details")
public String details(customer customer){
	repo.save(customer);
	return "Customers";
	
}



@RequestMapping("getdetails")
public String getdetails(){

	return "viewCustomer";
	
}

@PostMapping("getdetails")
public ModelAndView getdetails(@RequestParam("cid") int cid) {
	
ModelAndView mv = new ModelAndView("retrieve");
	
customer customers = repo.findById(cid).orElse(null);
mv.addObject(customers);
return mv;

}

}
