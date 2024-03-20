package com.ibm.Form.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.Form.vo.User;

@Controller
public class RegController {

    @GetMapping("/home1")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "Registration";
    }
    
    @PostMapping("/save")
	String save(@ModelAttribute ("user") User user)
	{
		System.out.println(user.getfName());
		System.out.println(user.getlName());
		System.out.println(user.getAge());
		System.out.println(user.getGender());
		System.out.println(user.getState());
    	return "Data";
		
	}
    
}
