package com.bridgelabz.di;

public class EmployeeInfo {
	
	private String empName;
	private int empAge;
	
	public void setEmpName(String empName) {
		this.empName = empName;
		
	}
	
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public void displayEmpInfo() {
		System.out.println("emp name is : " + empName + "\n" + "emp age is : " + empAge);
		
	}
	
	

}
