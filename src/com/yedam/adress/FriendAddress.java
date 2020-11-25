package com.yedam.adress;

import java.util.Scanner;

public class FriendAddress {

	private static final String Friend = null;

	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompFriend();
			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				searchFriend();
			}
		} // end of while
		System.out.println("프로그램 종료.");

	}// end of main

	private static void addUnivFriend() {
		// TODO Auto-generated method stub

	}

	// 1.친구등록
	public static void addFriend() {
		Scanner scn = new Scanner(System.in);
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("친구이름: ");
		Friend frnd = new Friend(name, phone);
//		insertFriend(Friend friend);
	}

//2.학교친구
	private static void UnivFriend(String friend2) {
		Scanner scn = new Scanner(System.in);
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String phone = scn.nextLine();
		System.out.print("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공정보");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setName(name);
		frnd.setPhone(phone);
	}

// 3.회사친구
	public static void addCompFriend() {
		Scanner scn = new Scanner(System.in);
		System.out.print("친구이름: ");
		String name = scn.nextLine();

		System.out.print("전화번호: ");
		String phone = scn.nextLine();

		System.out.print("학교이름: ");
		String univ = scn.nextLine();

		System.out.println("전공정보");
		String major = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(univ);
		frnd.setDepartment(major);
	}
//4.친구리스트
	public static void showFriendList() {
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendinfo();
			}
		}
	}

	public static void searchFriend() {
		System.out.println("전체 리스트를 선택했습니다");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendinfo();

			}
		}
	}

}
