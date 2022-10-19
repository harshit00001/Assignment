package com.training.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.service.HomeService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	HomeService service;
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String show()
	{
		//System.out.println();
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(HttpServletRequest request)
	{
		String userName=request.getParameter("uname");
		if(service.isValid(userName))
		{return "success";}
		else
		{return "failure";}
		//System.out.println()
	}
}
