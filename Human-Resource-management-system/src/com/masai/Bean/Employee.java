package com.masai.Bean;

public class Employee {
	private int Eid;
	private String EmplName;
	private String EmplUserName;
	private String Password;
	private int Edid;
	
	public Employee() {
		
	}
	
	
	
	public Employee(int eid, String ename, String username, String password, int edid) {
		
		Eid = eid;
		EmplName = ename;
		EmplUserName = username;
		Password = password;
		Edid = edid;
	}



	public int getEid() {
		return Eid;
	}



	public void setEid(int eid) {
		Eid = eid;
	}



	public String getEmplName() {
		return EmplName;
	}



	public void setEmplName(String ename) {
		EmplName = ename;
	}



	public String getUsername() {
		return EmplUserName;
	}



	public void setUsername(String username) {
		EmplUserName = username;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public int getEdid() {
		return Edid;
	}



	public void setEdid(int edid) {
		Edid = edid;
	}



	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", EmplName=" + EmplName + ", EmplUserName=" + EmplUserName + ", Password=" + Password
				+ ", Edid=" + Edid + "]";
	}





	
	
	
	

}
