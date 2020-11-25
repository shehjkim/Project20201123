package com.yedam.db;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String PhoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;
	
	//생성자:lastNaem, email, jobId, hireDate
	public Employee(String lastName, String email, String hireDate, String jobId) {
		super();
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
		
	}
	
	public Employee() {
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public void showEmpInfo() {
		System.out.println("사원번호: " + employeeId + " "
						 +"이름: " + firstName +" "+ lastName + " "
						 +"/ email: " + email + " "
						 +"/ 휴대폰번호: " + PhoneNumber + " "
						 +"/ 입사일: "+hireDate + " "
						 +"/ 부서" + jobId + " "
						 +"/ 급여:" + salary);
	}
}
