package com.yedam.abstracts;

public abstract class DmbPhone {

	// 필드
	public String Owner;

	// 생성자
	public DmbPhone(String owner) {
		this.Owner = owner;

	}

	public void ring() {
		System.out.println("4");
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
}
