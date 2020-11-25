package com.yedam.string;

public class StringExample {

	public static void main(String[] args) {

		

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 18, 97 }; // {] -> 문자값

		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes);
		System.out.println(str2.toString());					//toString() = return this 의 의미 / (str2) = (str2.toString()) 과 같음, toString이 숨겨진것

		String str3 = new String(bytes, 6, 4);
		System.out.println(str3.toString());


		char chr = str2.charAt(0);								//charAt = 문자추출  / 0번자리 문자 추출 
		System.out.println(chr);
		
	}

}

