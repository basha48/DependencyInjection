package com.bridgelabz.di;

public class DepartmentInfo {
	
	private String departmentName;
	private String departmentAddress;
	
	public DepartmentInfo(String departmentName, String departmentAddress) {
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}
	
	public void displayDeptInfo() {
		System.out.println("dept name is : " + departmentName + 
							"\n" + "dept address is : " + departmentAddress + "" );
	}
	
}
