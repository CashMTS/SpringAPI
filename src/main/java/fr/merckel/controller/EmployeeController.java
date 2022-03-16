package fr.merckel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.merckel.api.model.Employee;
import fr.merckel.api.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees(){
		return es.getEmployees();
	}
	
}
