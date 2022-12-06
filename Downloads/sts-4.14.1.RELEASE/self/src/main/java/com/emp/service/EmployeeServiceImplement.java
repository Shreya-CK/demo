package com.emp.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeDao;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;
@Service
public class EmployeeServiceImplement implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao; 
		@Override
	public List<Employee> getAllEmployee(){
	return employeeDao.getAllEmployee();
	}
		
	@Override
	public List<Employee> getEmployeeByDept(String department){
		List<Employee> newlist= employeeDao.getAllEmployee();
		List<Employee> newarray=new ArrayList<Employee>();
		newlist.forEach(c->{
			if( c.getDepartment().equalsIgnoreCase(department)) {
				newarray.add(c);
			}
		});
		return newarray;

	}
}
