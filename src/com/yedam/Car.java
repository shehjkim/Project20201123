package com.yedam;

public class Car {
	// field
	String company;
	String model;
	String color;
	int maxSpeed;

	// Constructor 생성자 : 필드 초기화
	public Car() {

	}

	public Car(String company) { // 회사만 출력하는 생성자
		this.company = company;

	}

	public	Car(String company, String model,         //4가지 모두 출력
				   String color, int maxSpeed) {
				this.company = company ;
				this.model = model;
				this.color = color;
				this.maxSpeed = maxSpeed;
				}
	
	ShowInfo

	public Car(String company, String model) { // 회사,모델 2가지만 출력
		this.company = company;
		this.model = model;
	}

	// Method 메소드
	// get,set 메소드 Source -Generate getter and setter 에서 생성가능
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
