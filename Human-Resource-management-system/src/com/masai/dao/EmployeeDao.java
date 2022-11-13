package com.masai.dao;

import java.sql.SQLException;
import java.util.List;


import com.masai.Exception.EmployeeException;
import com.masai.Bean.Employee;

public interface EmployeeDao {
	
	public String registerEmployee(Employee Employee);
	
	public Employee getEmployeeById(int Eid) throws EmployeeException, SQLException;	
    public Employee loginEmployee(String Username , String password) throws EmployeeException,SQLException;
    
    public List<Employee> allEmployeeDetails()throws EmployeeException,SQLException;
    
    public String changePassword(int Eid, String Password);
    
    public String updateEmployee(Employee employee, int Eid);
    
    public String changeDepartment(int Eid,int Edid);
    
    public String applyLeave(int empId, String status);
    
    public String acceptLeaves(int empId);
    
    public String rejectLeaves(int empId);
    
   
    
   
   

}
