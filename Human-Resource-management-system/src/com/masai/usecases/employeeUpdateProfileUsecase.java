package com.masai.usecases;

import java.util.Scanner;

import com.masai.Bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class employeeUpdateProfileUsecase {
	
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Name : ");
		String Ename=sc.next();
		
		System.out.println("Enter New Username  : ");
		String EmplUserName=sc.next();
		
		System.out.println("Enter New Password  : ");
		String pass=sc.next();
		
		
		System.out.println("Enter Employee Id  : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		
		employee.setEmplName(Ename);
		employee.setEmplUserName(EmplUserName);
		employee.setEmplPassword(pass);
		employee.setEdid(eid);
		
		String result = dao.updateEmployee(employee, eid);
	
		System.out.println(result);
	}
	
	public static void updateProfile() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Name : ");
		String Ename=sc.next();
		
		System.out.println("Enter New Username  : ");
		String EmplUserName=sc.next();
		
		System.out.println("Enter New Password  : ");
		String pass=sc.next();
		
		
		System.out.println("Enter Employee Id  : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		
		employee.setEmplName(Ename);
		employee.setEmplUserName(EmplUserName);
		employee.setEmplPassword(pass);
		employee.setEmplId(eid);
		
		String result = dao.updateEmployee(employee, eid);
	
		System.out.println(result);
	}

}
