package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeInfo emp  = context.getBean("emp",EmployeeInfo.class);
		emp.displayEmpInfo();
		DepartmentInfo dept = context.getBean("dept",DepartmentInfo.class);
		dept.displayDeptInfo();
		
	}

}
