package com.masai.dao;

import com.masai.Bean.Employee;
public interface EmployeeDao {
public String registerEmployee(Employee Employee);
    public String changePassword(int Eid, String Password);
    public String updateEmployee(Employee employee, int Eid);
    public String changeDepartment(int Eid,int Edid);
    public String applyLeave(int empId, String status);
    public String acceptLeaves(int empId);
    public String rejectLeaves(int empId);

}
