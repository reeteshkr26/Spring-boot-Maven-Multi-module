package com.emp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.app.model.Employee;
import com.emp.app.service.EmployeeService;

@RestController
@RequestMapping("/app")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/emp/get")
	public List<Employee> getAllEmps() {
		return empService.getAllEmployess();
	}

	@GetMapping("/emp/save")
	public String saveAllEmps() {
		return empService.saveEmployess();
	}

	@GetMapping("/check")
	public String checkApp() {
		return "Application is working";
	}
}
