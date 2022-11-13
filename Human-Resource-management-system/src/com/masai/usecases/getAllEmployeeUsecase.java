package com.masai.usecases;

import java.sql.SQLException;
import java.util.List;


import com.masai.Exception.EmployeeException;
import com.masai.Bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class getAllEmployeeUsecase {
	
	public static void main(String[] args) throws SQLException {
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			
		List<Employee> emp	=dao.allEmployeeDetails();
		
		emp.forEach(e->{
			System.out.println("Employee Id is : "+ e.getEmplId());
			System.out.println("Employe name is : "+e.getEmplName());
			System.out.println("Employee username is : "+e.getEmplUserName());
			System.out.println("Employee Department Id is "+e.getEdid());
			
			System.out.println("=====================================");
		});
		
		
		
		} catch (EmployeeException e) {
		
			System.out.println(e.getMessage());
		}
	}

}
