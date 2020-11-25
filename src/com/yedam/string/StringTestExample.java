package com.yedam.string;

public class StringTestExample {

	public static void main(String[] args) {
//		birth1=001010/3690001
//		birth2=920211-2006000
//		birth3=960221*1179684
//		birth4=0510104425771

		String[] birth = { "001010/3690001", "920211-2006000", "960221*1179684", "051010 4425771" };

		char sex = birth.charAt(7);

		for (int i = 1; i >= 4; i++) {
			if (sex == 1) {
				System.out.println("2000년 이전에 태어난 남자입니다");
			} else if (sex == 2) {
				System.out.println("2000년 이전에 태어난 여자입니다");
			} else if (sex == 3) {
				System.out.println("2000년 이후에 태어난 남자입니다");
			} else {
				System.out.println("2000년 이후에 태어난 여자입니다");
			}

		}

	}

}
