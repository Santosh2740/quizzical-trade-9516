package com.masai.dao;


import java.util.List;
import com.masai.Exception.DepartmentException;
import com.masai.Bean.Department;


public interface DepartmentDao  {
	
	 public String registerDepartment(Department Department);
	
	 public List<Department> allDepartment()throws DepartmentException;
	 
	 public String updateDepartment(Department department);
	

}

