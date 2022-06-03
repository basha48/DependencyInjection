package com.bridgelabz.di;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class EmployeeInfo {
	
	
	@Value("hareesh")
	private String empName;



	
	@Value("50")
	private int empAge;
	

	public int getEmpAge() {
		return empAge;
	}



	public void displayEmpInfo() {
		System.out.println("emp name is : " + empName + "\n" + "emp age is : " + empAge);
		
	}
	
	

}
