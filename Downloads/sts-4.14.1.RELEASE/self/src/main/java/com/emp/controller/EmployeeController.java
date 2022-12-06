package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/bel")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
	//@GetMapping(value="/employees")
	@RequestMapping(method=RequestMethod.GET,value="/employees")
	public ModelAndView getAllEmployeeDetails() throws Exception{
		List<Employee> employeeList=employeeService.getAllEmployee();
		ModelAndView modelAndView=new ModelAndView("employeeDetails");
		modelAndView.addObject("employees",employeeList);
		return modelAndView;
	}

	@GetMapping(value="/employees/department")
public ModelAndView getEmployeeByDept(String department) throws Exception{
		List<Employee> empList =employeeService.getEmployeeByDept(department);
		System.out.println(department);
		ModelAndView modelAndView=new ModelAndView("employeeDetails");
		for(int i=0;i<empList.size();i++) {
			Employee d=empList.get(i);
			
			//if (d.getDepartment().equalsIgnoreCase(department)) {
			//	modelAndView.addObject("employees",empList);
			//}
				
			if (d.getDepartment().equals("Military Communication")) {
				modelAndView.addObject("employees",empList);
			}
			else if(d.getDepartment().equals("Naval Systems")){
				modelAndView.addObject("employees",empList);
				modelAndView.setViewName("employeeDetails");
				}
		}
		return modelAndView;
	}
}