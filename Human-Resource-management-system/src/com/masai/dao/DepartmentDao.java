package com.masai.dao;


import java.sql.SQLException;
import java.util.List;
import com.masai.Exception.DepartmentException;
import com.masai.Bean.Department;


public interface DepartmentDao  {
	
	 public String registerDepartment(Department Department);
	
	 public List<Department> allDepartment()throws DepartmentException,SQLException;
	 
	 public String updateDepartment(Department department);
	

}

