	//Friend : 이름/연락처
	//-UnivFriend: 학교/전공
	//-CompFriend: 회사/부서

package com.yedam.adress;
//필드
public class Friend {
	private String name;
	private String phone;
	//생성자	
	public Friend(String name, String phone) {
		this.name=name;
		this.phone=phone;
			}
//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void showFriendinfo() {
		System.out.println("이름: " + this.name + "연락처: " + this.phone);
		
	}
	
}
