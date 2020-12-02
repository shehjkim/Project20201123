package com.yedam;

import java.util.Arrays;
import java.util.Scanner;

public class Intpractice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 정수 3개를 입력받아 오름차순으로 정렬하는 프로그램
		// 34 29 67

		int[] intArray = new int[3];

		System.out.println("첫번째 정수 입력");
		int Array = scn.nextInt();
		System.out.println("두번째 정수 입력");
		int Array1 = scn.nextInt();
		System.out.println("세번째 정수 입력");
		int Array2 = scn.nextInt();
		System.out.println("세가지 정수를 오름차순으로 정렬");
		intArray = new int[] { Array, Array1, Array2 };
		Arrays.sort(intArray);
		for (int j : intArray) {
			System.out.println("[" + j + "]");
		}

	}
}