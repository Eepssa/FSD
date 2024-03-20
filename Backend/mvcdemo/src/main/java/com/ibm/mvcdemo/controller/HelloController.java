package com.ibm.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.mvcdemo.entity.User;
import com.ibm.mvcdemo.service.UserService;
import com.ibm.mvcdemo.vo.UserVo;

@Controller
public class HelloController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/home")
	String getHomePage(ModelAndView mv)
	{
		
		return "Hello";
	}
	@PostMapping("/save")
	String save(@ModelAttribute User user, Model m)
	{
		System.out.println(user);
		userService.save(user);
		
		User user1= userService.findById(1);
		//m.addAttribute("name", userService.makeUpper(user.getfName()));
		m.addAttribute("user", user1 );
		return "list";
		
	}
	@GetMapping("/savev2/{name}/{prof}")
	String getHomePageV2(ModelAndView mv,@PathVariable String name,@PathVariable int prof)
	{
		System.out.println(name+" " + prof);
		return "Hello";
	}
	@GetMapping("/savev3")
	String getHomePageV3(ModelAndView mv,@RequestParam String name,@RequestParam String prof)
	{
		System.out.println(name+" " + prof);
		return "Hello";
	}
}

