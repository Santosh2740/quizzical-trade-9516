package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.EmployeeException;
import com.masai.Exception.DepartmentException;
import com.masai.Bean.Department;
import com.masai.Bean.Employee;
import com.masai.utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String registerDepartment(Department Department) {
		
		String message ="Not Inserted..";
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Department value(?,?)");
			
			ps.setString(1, Department.getDeptName());
			ps.setInt(2, Department.getDeptNo() );
			
			
			int X= ps.executeUpdate();

			 // Here String message is used!!
			 //Otherwise throw error
			if(X>0)
				message="Department Added  Sucessfully !";
			
			
			} catch (SQLException e) {
				// Here String message is used!!
			 //Otherwise throw error
				message=e.getMessage();
			}
			
			return message;
	}

	@Override
	public List<Department> allDepartment() throws DepartmentException,SQLException {
		
		
		List<Department> departments= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from department");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				String DeptName= rs.getString("DeptName");
				int DeptNo = rs.getInt("DeptNo");
				int Did=rs.getInt("Did");
				
				Department department= new Department(DeptName, DeptNo,Did) ;

				departments.add(department);
				
			}
			
		}catch (SQLException e) {
		throw new DepartmentException();
		
		}
		if(departments.size()==0) 
			throw new DepartmentException("No Department Found ! .. ");
		
		
		
		
		return departments;
	}

	@Override
	public String updateDepartment(Department department) {
		
		String message="Department Not fount !...";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update department set DeptName=? where DNO=?");
			ps.setString(1, department.getDeptName());
			ps.setInt(2, department.getDeptNo());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Department update";
			}
			
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}
	
	

}
