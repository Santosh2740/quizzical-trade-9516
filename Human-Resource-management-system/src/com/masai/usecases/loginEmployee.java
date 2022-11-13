package com.masai.usecases;


import java.sql.SQLException;
import java.util.Scanner;


import com.masai.Application.employeeLink;
import com.masai.Exception.EmployeeException;
import com.masai.Bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class loginEmployee {
	
	public static void main(String[] args) {
		
		
	}
	
	public loginEmployee() throws SQLException {
		

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String username=sc.next();
		
		System.out.println("Enter password : ");
		String pass = sc.next();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		
		try {
			Employee employee = dao.loginEmployee(username, pass) ;
			System.out.println("Welcome Employee : "+employee.getEmplName());
			employeeLink.linkingEmployeeMethod();
					
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void loginEmployee() {
		// TODO Auto-generated method stub
		
	}

}
