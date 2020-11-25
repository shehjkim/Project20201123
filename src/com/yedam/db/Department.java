package com.yedam.db;

public class Department {

	private int department_Id;
	private String department_Name;
	private int manager_Id;
	private int location_Id;

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public int getManager_Id() {
		return manager_Id;
	}

	public void setManager_Id(int manager_Id) {
		this.manager_Id = manager_Id;
	}

	public int getLocation_Id() {
		return location_Id;
	}

	public void setLocation_Id(int location_Id) {
		this.location_Id = location_Id;
	}

	public void showEmpInfo() {
		System.out.println("부서번호: " + department_Id + " " + "부서이름: " + department_Name + " " + "/ 매니저번호: " + manager_Id
				+ " " + "/ 지역번호: " + location_Id + " ");

	}
}