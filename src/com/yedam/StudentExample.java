package com.yedam;

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student("한국대", "김하나", 2020111, "국어국문");
		System.out.println("학교 : " + s1.getSchool());
		System.out.println("이름 : " + s1.getName());
		System.out.println("학번 : " + s1.getStNum());
		System.out.println("과목: " + s1.getMajor());

		Student s2 = new Student();
		s2.School = "한국대학교";
		s2.Name = "김둘";
		s2.StNum = 2020222;
		s2.Major = "영어영문";
		s2.showInfo();

		
		Student s3 = new Student();
		s3.School = "한국대학교";
		s3.Name = "김셋";
		s3.StNum = 2020333;
		s3.Major = "수학과";
		s3.showInfo();

		Student[] students = {s1, s2, s3};
		
		
	}

}
