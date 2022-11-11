package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

import com.masai.Bean.Employee;
import com.masai.utility.DBUtil;
public class EmployeeDaoImpl implements EmployeeDao{
	@Override
	public String registerEmployee(Employee Employee) {
	String message ="Not Inserted..";
		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement("insert into employee(Ename,Username,Password,Edid) value(?,?,?,?)");
			ps.setString(1, Employee.getEmpName());
			ps.setString(2, Employee.getUserName());
			ps.setString(3, Employee.getPassword());
			ps.setInt(4,Employee.getEdid());
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message="Employee Registered Sucessfully !";
			}
		    catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
		
	}
		@Override
	public String updateEmployee(Employee employee, int EmplId) {

		String message="Employee Not fount !...";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update Employee set Ename=?,username=?,Password=? where Eid=?");
			
			ps.setString(1, employee.getEmpName());
			ps.setString(2, employee.getUserName());
			ps.setString(3, employee.getPassword());
			ps.setInt(4, employee.getEdid());
		
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Employee update";
			}
			
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String changePassword(int Eid , String Password) {
	String message="Employee Not found !...";
		
	Employee employee =new Employee();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update employee set password=? where Eid=?");
		    ps.setString(1, employee.getPassword() );
			ps.setInt(2, employee.getEmplId());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Password update";
			}
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String changeDepartment(int Eid, int EDid) {
		String message="Department Not found !...";
		
		Employee employee =new Employee();
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update employee set Edid=? where Eid=?");
			    ps.setInt(1, employee.getEdid());
				ps.setInt(2, employee.getEmplId());
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Department update";
				}
				
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
	}

	@Override
	public String applyLeave(int empId, String status) {
		
		String message ="Not Applied..";
		
		
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into leaves value(?,?)");
			
			
			ps.setInt(1, empId);
			ps.setString(2, status);
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message=" Applied For leave Sucessfully !";
			
			
			} catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
	}

	@Override
	public String acceptLeaves(int empId) {
		
		String message="Employee Not found !...";
	
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update leaves set status='Approve' where empId=?");
		
				ps.setInt(1, empId);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Employee leaves Accepted ";
				}
				
				
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
	}




	@Override
	public String rejectLeaves(int empId) {
		String message="Employee Not found !...";
				
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps=conn.prepareStatement("update leaves set status='Reject' where empId=?");
				ps.setInt(1, empId);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Employee leaves Rejected Sucssesfully ";
				}
			} catch (SQLException e) {
				
				message=e.getMessage();
			}
			
			return message;
		}
	

}
