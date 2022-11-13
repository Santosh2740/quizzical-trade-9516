package com.masai.usecases;

import java.sql.SQLException;
import java.util.List;

import com.masai.Exception.DepartmentException;
import com.masai.Bean.Department;
import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImpl;


public class getAllDepartmentUsecase {
	
	
	public static void main(String[] args) throws SQLException {
		

		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
			
		List<Department> dep=dao.allDepartment();
		
		dep.forEach(e->{
			System.out.println("Employee Id is : "+ e.getDeptName());
			System.out.println("Employe name is : "+e.getDeptNo());
			
			
			System.out.println("=====================================");
		});
		
		
		
		} catch (DepartmentException e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	public static void viewAllDepartment() throws SQLException {
		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
			
		List<Department> dep=dao.allDepartment();
		
		dep.forEach(e->{
			System.out.println("Employee Id is : "+ e.getDeptName());
			System.out.println("Employe name is : "+e.getDeptNo());
			
			
			System.out.println("=====================================");
		});
		
		
		} catch (DepartmentException e) {
		
			System.out.println(e.getMessage());
		}
	}

}
