package com.yedam;

public class Student {

	// 학교이름 이름 학번 전공
	String School;
	String Name;
	int StNum;
	String Major;

	public Student(String School, String Name,
					int StNum, String Major) {
		this.StNum = StNum;
		this.Major = Major;

	}
	

	}

	public void showInfo() {
		System.out.println("학교 :" + School);
		System.out.println("이름: "+ Name);
		System.out.println("학번: " + StNum);
		System.out.println("전공:" + Major);
	}

	// 메소드 get,set
	public String getSchool() {
		return School;
	}

	public void setSchool(String School) {
		School = School;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStNum() {
		return StNum;
	}

	public void setStNum(int stNum) {
		StNum = stNum;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

}
