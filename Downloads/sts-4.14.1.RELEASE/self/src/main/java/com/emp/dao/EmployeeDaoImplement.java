package com.emp.dao;

import java.util.*;
import com.emp.model.Employee;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImplement implements EmployeeDao {
	 public List<Employee> getAllEmployee(){  
	 List<Employee> employeeList=new ArrayList<>();
//	 Employee employee1=new Employee("Shreya",1,"Military Communication","Bangalore","Trainee");
//	 Employee employee2=new Employee("Shashank",2,"Military Communication","Bangalore","Trainee");
//	 Employee employee3=new Employee("Varun",3,"Naval Systems","Bangalore","Trainee");
//	 Employee employee4=new Employee("Hima",4,"Naval Systems","Noida","Trainee");
	
	 Employee employee1 = new Employee();
	 Employee employee2 = new Employee();
	 employee1.setEmployeeName("Shreya");
	 employee1.setEmployeeId(1);
	 employee1.setDepartment("Military Communication");
	 employee1.setLocation("Bangalore");
	 employee1.setRole("Trainee");
	
	 employee2.setEmployeeName("Shashank");
	 employee2.setEmployeeId(2);
	 employee2.setDepartment("Military Communication");
	 employee2.setLocation("Bangalore");
	 employee2.setRole("Trainee");
	
	employeeList.add(employee1);
	employeeList.add(employee2);
//	employeeList.add(employee3);
//	employeeList.add(employee4);
	return employeeList;
}
}