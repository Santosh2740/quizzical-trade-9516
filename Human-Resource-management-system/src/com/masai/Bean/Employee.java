package com.masai.Bean;

public class Employee {
	private int EmplId;
	private String EmpName;
	private String UserName;
	private String Password;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emplId, String empName, String userName, String password) {
		super();
		EmplId = emplId;
		EmpName = empName;
		UserName = userName;
		Password = password;
	}
	public int getEmplId() {
		return EmplId;
	}
	public void setEmplId(int emplId) {
		EmplId = emplId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Employee [EmplId=" + EmplId + ", EmpName=" + EmpName + ", UserName=" + UserName + ", Password="
				+ Password + "]";
	}
	

}
