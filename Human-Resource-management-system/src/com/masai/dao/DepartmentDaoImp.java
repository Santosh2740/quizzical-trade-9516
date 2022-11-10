package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.masai.Bean.Department;
import com.masai.utility.DBUtil;
public class DepartmentDaoImp implements DepartmentDao{
	@Override
	public String registerDepartment(Department Department) {
		
		String message ="Not Inserted..";
		
		
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Department value(?,?)");
			
			
			ps.setString(1, Department.getDeptName());
			ps.setInt(2, Department.getDeptNo() );
			
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message="Department Added  Sucessfully !";
			
			
			} catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
	}



	@Override
	public String updateDepartment(Department department) {
		
		String message="Department Not fount !...";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update department set Dname=? where DNO=?");
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
