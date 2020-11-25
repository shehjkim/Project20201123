package com.ydm.db2;
//전체조회 한건조회 입력 수정 삭제

import java.util.List;

public interface EmpService {
	

	public List getEmpList();					//전체조회
	public EmployeeVO getEmp(int empId);		//한건조회
	public void insertEmp(EmployeeVO empVO); 	//입력안 반환타입없어서 void
	public void updateEmp(EmployeeVO empVO);	//수정
	public void deleteEmp(int empId);			//삭제
	

	
}
