package com.emp.model;

public class Employee {
//	private String employeeName; 
//	private int employeeId;
//	private static int counter;
	//private float phoneNumber;
	//private String email;
//	private String location;
//	private String department;
//	private String role;
	
	public String employeeName; //replace private with publuic
	public int employeeId;
	public static int counter;
	//private float phoneNumber;
	//private String email;
	public String location;
	public String department;
	public String role;
	
	
	
	public Employee() {}
	//static {
	//	counter=1;
	//}
	
	
//	public Employee(String employeeName,int employeeId,String location,String department,String role){
//		
//		this.employeeName=employeeName;
//		this.employeeId=employeeId;
//		//this.employeeId=++counter;
//		this.location=location;
//		this.department=department;
//		this.role=role;
//	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
