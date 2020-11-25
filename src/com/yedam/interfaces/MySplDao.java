package com.yedam.interfaces;

public class MySplDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색.");

	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에서 입력.");

	}

	@Override
	public void update() {
		System.out.println("Mysql DB에서 업데이트.");

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제.");

	}

}
