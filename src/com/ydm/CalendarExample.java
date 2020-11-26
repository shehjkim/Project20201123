package com.ydm;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		showCal(2020, 1);

	}

	public static void showCal(int year, int month) {
		System.out.println("\t" + "     [" + year + "년" + month + "월" + "]");

		// 요일 정보
		String[] days = { "Sun", "Mon", "The", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%5s", days[i]);				//System.out.printf("출력할 서식",출력할 내용);
		}													//출력 후 줄바꿈 안함	
															// %s는 문자열 형식으로 출력
		System.out.println();
		int tMonth = month-1; // 입력월과 calendar월 매칭
		Calendar cal = Calendar.getInstance();
		cal.set(year, tMonth, 1);
		int lDate = cal.getActualMaximum(Calendar.DATE); 	// 마지막날
		int fDay = cal.get(Calendar.DAY_OF_WEEK); 			// 첫째날 요일

		for (int i = 1; i < fDay; i++) {
			System.out.printf("%5s", " ");
		}
		for (int i = 0; i < lDate; i++) {
			System.out.printf("%5d", (i + 1));				//%d는 정수 형식으로 출력
			if ((i + fDay) % 7 == 0) {
				System.out.println();
			}
		}

////		cal.set(2020, 5, 1); // 2020년 5월 1일
//		System.out.println("년도 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " + cal.get(Calendar.MONTH));
//		System.out.println("날짜 : " + cal.get(Calendar.DATE));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));

	}

}
