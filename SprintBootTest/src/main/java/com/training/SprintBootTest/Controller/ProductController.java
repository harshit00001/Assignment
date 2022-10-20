package com.training.SprintBootTest.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.SprintBootTest.model.Product;
import com.training.SprintBootTest.service.ProdService;

@Controller
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ProdService service;
	
	@GetMapping("/home")
	public String show(Model map)
	{
		map.addAttribute("prodText","Welcome");
		return "prodform";
	}
	@PostMapping("/save")
	public String login(Model map, HttpServletRequest request)
	{
			Product prod = new Product();
			String prodName= request.getParameter("pname");
			String prodPrice= request.getParameter("price");
			prod.setProdName(prodName);
			prod.setPrice(Double.parseDouble(prodPrice));

			if(service.isValid(prodName))
			{
				map.addAttribute("prodText", "Duplicate Product Item! Please Enter New Product Item");
				return "failure";
			}
			else
			{
				service.save(prod);
				map.addAttribute("prodText", "Product data saved Successfully");
				return "success";	
			}
	}
	
	@PostMapping("/findId")
	public String findId(Model map, HttpServletRequest request) {
		Product prod = new Product();
		String prodId= request.getParameter("pid");
		prod=service.getProd(Integer.parseInt(prodId));
		map.addAttribute("prodText","Id: "+ prodId+ " ,Product Name:  "+ prod.getProdName() +" ,Price: "+prod.getPrice());
		return "success";
		
	}
	@PostMapping("/findAll")
	public String findAll(Model map, HttpServletRequest request) {
		List<Product> prod=new ArrayList<>();
		prod=service.prodLists();
		map.addAttribute("prodText",prod);
		return "findAll";
	}
	@PostMapping("/deleteById")
	public String deleteById(Model map, HttpServletRequest request) {
		String DelId= request.getParameter("DelId");
		service.deleteProd(Integer.parseInt(DelId));
		map.addAttribute("prodText",DelId + " is Deleted!");
		return "success";
	}
	

}
