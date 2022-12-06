package com.emp.service;

import java.util.List;
import com.emp.model.Employee;
public interface EmployeeService {
public List<Employee> getAllEmployee();
public List<Employee> getEmployeeByDept(String department);
}