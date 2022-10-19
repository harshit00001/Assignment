package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Employee;
import com.training.springboot.repository.HomeRepository;




@Service
public class HomeService {
	@Autowired
	HomeRepository repo;
	
	public boolean isValid(String empName)
	{
		List<Employee> empList=repo.findAll();
		boolean valid=false;
		for(Employee emp: empList)
		{
			if(emp.getEmpName().equalsIgnoreCase(empName))
				{valid=true;}
		}
		return valid;
	}
	public void save(Employee emp) {
		repo.save(emp);
	}
	
	public List<Employee> listUsers(){
		return repo.findAll();
	}
	
	public Employee getUser(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteUser(int id) {
		repo.deleteById(id);
	}


}
