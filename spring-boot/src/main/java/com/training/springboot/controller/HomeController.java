package com.training.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Employee;
import com.training.springboot.service.HomeService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	HomeService service;
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String show(Model map)
	{
		map.addAttribute("userText","Welcome");
		return "login";
	}
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String login(Model map, HttpServletRequest request)
	{
			Employee user = new Employee();
			String userName= request.getParameter("uname");
			String empSal= request.getParameter("sal");
			user.setEmpName(userName);
			user.setEmpSal(Double.parseDouble(empSal));
			
			service.save(user);
			map.addAttribute("userText", "User data saved Successfully");
			return "success";
//		String userName=request.getParameter("uname");
//		if(service.isValid(userName))
//		{return "success";}
//		else
//		{return "failure";}
		//System.out.println()
	}

	@RequestMapping(value="findId" ,method=RequestMethod.POST)
	public String findId(Model map, HttpServletRequest request) {
		Employee user = new Employee();
		String userId= request.getParameter("uid");
		user=service.getUser(Integer.parseInt(userId));
		map.addAttribute("userText",userId+ " , "+ user.getEmpName() +" , "+user.getEmpSal());
		return "success";
		
	}
	@RequestMapping(value="findAll" ,method=RequestMethod.POST)
	public String findAll(Model map, HttpServletRequest request) {
		List<Employee> user=new ArrayList<>();
		user=service.listUsers();
		map.addAttribute("userText",user);
		return "findAll";
	}
	@RequestMapping(value="deleteById" ,method=RequestMethod.POST)
	public String deleteById(Model map, HttpServletRequest request) {
		String DelId= request.getParameter("DelId");
		service.deleteUser(Integer.parseInt(DelId));
		map.addAttribute("userText",DelId + " is Deleted!");
		return "success";
	}
	
	
}
