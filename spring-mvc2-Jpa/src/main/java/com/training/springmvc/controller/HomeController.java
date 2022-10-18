package com.training.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springmvc.model.User;
import com.training.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="home" ,method=RequestMethod.GET)
	public String greet(Model map) {
		System.out.println("Inside controller method..");
		map.addAttribute("msg", "Hello From Spring MVC");
		return "home";
	}
	
	@RequestMapping(value="getUser" ,method=RequestMethod.GET)
	public String getVal(Model map, @RequestParam int userId) {
		
		User user = service.getUser(userId);
		System.out.println("User Name: "+user.getUserName());
		map.addAttribute("uId", user.getUserName());
		return "user";
		
	}
	@RequestMapping(value="getName/{name}" ,method=RequestMethod.GET)
	public String getName(Model map, @PathVariable String name, HttpServletRequest request) {
		System.out.println("User Name: "+name);
		map.addAttribute("name", name);
		return "username";
		
	}
	
	@RequestMapping(value="save" ,method=RequestMethod.POST)
	public String save(Model map, HttpServletRequest request) {
		User user = new User();
		String userName= request.getParameter("uname");
		user.setUserName(userName);
		
		service.save(user);
		map.addAttribute("userText", "User data saved Successfully");
		return "username";
		
	}
	@RequestMapping(value="findId" ,method=RequestMethod.POST)
	public String findId(Model map, HttpServletRequest request) {
		User user = new User();
		String userId= request.getParameter("uid");
		user=service.getUser(Integer.parseInt(userId));
		map.addAttribute("userText",user.getUserName());
		return "username";
		
	}
	@RequestMapping(value="findAll" ,method=RequestMethod.POST)
	public String findAll(Model map, HttpServletRequest request) {
		List<User> user=new ArrayList<>();
		user=service.listUsers();
		map.addAttribute("userText",user);
		return "findAll";
	}
	@RequestMapping(value="deleteById" ,method=RequestMethod.POST)
	public String deleteById(Model map, HttpServletRequest request) {
		String DelId= request.getParameter("DelId");
		service.deleteUser(Integer.parseInt(DelId));
		map.addAttribute("userText",DelId + " is Deleted!");
		return "username";
	}

}
