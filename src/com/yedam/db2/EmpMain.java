package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

import oracle.net.aso.a;

public class EmpMain {

	public static void main(String[] args) {
		// 1.전체조회 2.한건조회 3.입력 4.수정 5.삭제

		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (true) {

			System.out.println("-------------------------------");
			System.out.println("1.전체조회 2.한건조회 3.입력 4.수정 5.삭제");
			System.out.println("-------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpVoInfo();
				}
			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호 입력: ");
				int empId = scn.nextInt();
				EmployeeVO EmpVo = service.getEmp(empId);
				EmpVo.showEmpVoInfo();
				

			} else if (selectNo == 3) {
				System.out.println("입력할 사원번호: ");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("입력할 이름: ");
				String firstName = scn.nextLine();
				System.out.println("입력할 성: ");
				String lastName = scn.nextLine();
				System.out.println("입력할 이메일: ");
				String email = scn.nextLine();
				System.out.println("입력할 전화번호: ");
				String phoneNumber = scn.nextLine();
				System.out.println("입력할 입사일: ");
				String hireDate = scn.nextLine();
				System.out.println("입력할 직책: ");
				String jobId = scn.nextLine();		
				System.out.println("입력할 급여: ");
				int salary = scn.nextInt();
				
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setFirstName(firstName);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setHireDate(hireDate);
				vo.setJobId(jobId);
				vo.setSalary(salary);
				
				service.insertEmp(vo);

			} else if (selectNo == 4) {
				System.out.println("수정할 사원번호: ");
				int empId = scn.nextInt(); scn.nextLine();
				System.out.println("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호: ");
				String phoneNumber = scn.nextLine();
				System.out.println("수정할 급여: ");
				int salary = scn.nextInt();
			
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(salary);
				
				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();
				EmployeeVO EmpVo = service.getEmp(empId);
				

			} else if (selectNo == 6) {

				break;
			}

		}
	}	
}
