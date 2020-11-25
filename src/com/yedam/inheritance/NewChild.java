package com.yedam.inheritance;

public class NewChild extends Parent {
	String field3;

	public NewChild(String f1, String f2) {
	}

	public void method3() {
		super.method1();
		System.out.println("method3 () 호출.");

	}

}
