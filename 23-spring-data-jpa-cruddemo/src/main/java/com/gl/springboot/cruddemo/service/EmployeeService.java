package com.gl.springboot.cruddemo.service;

import java.util.List;

import com.gl.springboot.cruddemo.entity.Employee;
import com.gl.springboot.cruddemo.entity.Role;
import com.gl.springboot.cruddemo.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	
	public List<Employee> searchbyFirstName(String firstName);
	 
	public List<Employee> sortByFirstNameAsc();
	
	public User saveUser(User user);
	public Role saveRole(Role role);
}
