package com.emp.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emp.app.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
