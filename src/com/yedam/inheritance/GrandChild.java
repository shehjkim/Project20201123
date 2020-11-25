package com.yedam.inheritance;

public class GrandChild extends Parent {
	String field4;

	public GrandChild(String f3, String f4) {
	}

	public void method4() {
		super.method1();
		System.out.println("method4 () 호출.");
	}

}
