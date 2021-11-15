package com.emp.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.app.model.Employee;
import com.emp.app.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	public List<Employee> getAllEmployess(){
		return empRepo.findAll();
	}
	public String saveEmployess() {
		List<Employee> emps=new ArrayList<>();
		Employee emp1=new Employee();
		emp1.setId("emp101");
		emp1.setName("Reetesh");
		emp1.setAge(22);
		emp1.setAddress("Mumbai");
		Employee emp2=new Employee();
		emp2.setId("emp102");
		emp2.setName("Puja");
		emp2.setAge(23);
		emp2.setAddress("Delhi"); 
		emps.add(emp2);
		emps.add(emp1);
		empRepo.saveAll(emps);
		return "Employess Saved";
	}
	
}
