package com.yedam.db;

import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 사원정보, 부서정보
		while (true) {
			System.out.println("==================================");
			System.out.println("1.사원정보 2.부서정보 3.종료 4.사원입력");
			System.out.println("==================================");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt(); scn.nextLine();
			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpInfo();
					}
				}
			} else if (selectNo == 2) {
				EmpDAO dao = new EmpDAO();
				Department[] department = dao.getDepList();
				for (Department dep : department) {
					if (dep != null) {
						dep.showEmpInfo();
					}
				}

			} else if (selectNo == 3) {
				break;

			} else if (selectNo == 4) {
				addEmployee();

			}

		}

		EmpDAO dao = new EmpDAO();
		Employee[] employees = dao.getEmpList();
		for (Employee emp : employees) {
			if (emp != null) {
				emp.showEmpInfo();

			}

		}
		System.out.println("end of prog");
	}// end of while

	public static void addEmployee() {
		System.out.println("이름 입력하세요. ");
		String name = scn.nextLine();
		System.out.println("이메일을 입력하세요.");
		String email = scn.nextLine();
		System.out.println("직무를 입력하세요. ");
		String jobid = scn.nextLine();
		System.out.println("입사일자를 입력하세요.(YY/MM/DD 형식으로 쓰시오)");
		String hiredate = scn.nextLine();

		Employee emp = new Employee(name, email, hiredate, jobid);
		EmpDAO dao = new EmpDAO();
		dao.inserEmployee(emp);
	}
}// end of class
