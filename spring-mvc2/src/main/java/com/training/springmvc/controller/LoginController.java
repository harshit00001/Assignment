package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String login(ModelMap map)
	{
		System.out.println("Login Page");
		return "index";
	}
	@RequestMapping(value="loginsuccess", method=RequestMethod.POST)
	public String loginSuccess(ModelMap map)
	{
		System.out.println("Inside Controller Method");
		map.addAttribute("msg","Login Successful");
		return "loginsuccess";
	}

}
