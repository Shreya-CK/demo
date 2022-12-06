package com.emp.dao;
import java.util.List;
import com.emp.model.Employee;

import org.springframework.stereotype.Repository;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();

}
