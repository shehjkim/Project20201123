package com.yedam;

public class CalExample {

	public static void main(String[] args) {
//		Calculator c1 = new Calculator() ;
//		c1.setColor("white");
//		c1.plus(3, 5);

		int result = Calculator.plus(3, 5);
		System.out.println(Calculator.pi);
		result = Calculator.minus(10, 5);
		System.out.println(result);

		CalExample cel = new CalExample();
		result = cel.sum(3, 5);

	}

	public static int sum(int a, int b) {
		return a + b;

	}

}
