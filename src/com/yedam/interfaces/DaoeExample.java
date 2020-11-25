package com.yedam.interfaces;

public class DaoeExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySplDao());
		
		
	}

}
