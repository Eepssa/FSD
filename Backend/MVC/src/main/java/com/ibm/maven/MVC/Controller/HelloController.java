package com.ibm.maven.MVC.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ibm.com.maven.MVC.vo.UserService;

@Controller
public class HelloController {

	@GetMapping("/home")
    public String showForm(Model model) {
        model.addAttribute("userservice", new UserService());
        return "Hello";
    }
    
    @PostMapping("/save")
	public String save(@ModelAttribute("userservice") UserService userservice)
	{
		System.out.println(userservice.getFName());
	System.out.println(userservice.getLName());
		System.out.println(userservice.getGender());
		System.out.println(userservice.getVehicle());
		
		
		return "list";
		
	}
   
}