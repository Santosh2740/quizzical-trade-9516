package com.masai.Bean;

public class Department {
	private String DeptName;
	private int DeptNo;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, int deptNo) {
		super();
		DeptName = deptName;
		DeptNo = deptNo;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Department [DeptName=" + DeptName + ", DeptNo=" + DeptNo + "]";
	}

	

}
