package com.masai.Bean;

public class Employee {
	private int EmplId;
	private String EmplName;
	private String EmplUserName;
	private String EmplPassword;
	private int Edid;
	
	public Employee() {
		
	}
	
	
	
	public Employee(int eid, String ename, String username, String EmplPassword, int edid) {
		
		EmplId = eid;
		EmplName = ename;
		EmplUserName = username;
		EmplPassword = EmplPassword;
		Edid = edid;
	}



	public int getEmplId() {
		return EmplId;
	}



	public void setEmplId(int eid) {
		EmplId = eid;
	}



	public String getEmplName() {
		return EmplName;
	}



	public void setEmplName(String ename) {
		EmplName = ename;
	}



	public String getEmplUserName() {
		return EmplUserName;
	}



	public void setEmplUserName(String username) {
		EmplUserName = username;
	}



	public String getEmplPassword() {
		return EmplPassword;
	}



	public void setEmplPassword(String EmplPassword) {
		EmplPassword = EmplPassword;
	}



	public int getEdid() {
		return Edid;
	}



	public void setEdid(int edid) {
		Edid = edid;
	}



	@Override
	public String toString() {
		return "Employee [EmplId=" + EmplId + ", EmplName=" + EmplName + ", EmplUserName=" + EmplUserName + ", EmplPassword=" + EmplPassword
				+ ", Edid=" + Edid + "]";
	}





	
	
	
	

}
