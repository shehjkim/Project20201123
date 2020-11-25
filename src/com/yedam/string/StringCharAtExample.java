package com.yedam.string;

public class StringCharAtExample {

	public static void main(String[] args) {   //String 메소드 , charAt 문자추출 
		String ssn = "010624-5230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		
		case '1':
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' : 
			System.out.println("여자 입니다");
			break;
			
		case '5' :
		case '6' :
			System.out.println("외국인 입니다");
			break;
			
		}

	}

}
