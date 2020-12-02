package com.yedam.db2;

import java.sql.SQLException;

import com.yedam.common.DAO;

public class EmployeeVO {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String PhoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;
	private String department_id;

	// 생성자:lastName, email, jobId, hireDate
	public EmployeeVO(int employee_id, String firstName, String lastName, String email, String hireDate, String jobId,
			int salary, String depId) {
		super();
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.department_id = depId;

	}

	public EmployeeVO() {

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showEmpVoInfo() {
		System.out.println("사원번호: " + employeeId + " " + "이름: " + firstName + " " + lastName + " " + "/ email: " + email
				+ " " + "/ 휴대폰번호: " + PhoneNumber + " " + "/ 입사일: " + hireDate + " " + "/ 부서: " + jobId + " " + "/ 급여:"
				+ salary + "/ 부서번호: " + department_id);

	}

}
