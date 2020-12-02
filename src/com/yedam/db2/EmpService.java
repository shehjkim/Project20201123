package com.yedam.db2;
//전체조회 한건조회 입력 수정 삭제

import java.util.List;

public interface EmpService {
	

	public List getEmpList();					//전체조회
	public EmployeeVO getEmp(int empId);		//한건조회
	public void insertEmp(EmployeeVO empVO); 	//입력안 반환타입없어서 void
	public void updateEmp(EmployeeVO empVO);	//수정
	public void deleteEmp(EmployeeVO empVO);	//삭제
	public List<EmployeeVO> getDeptList(String deptId);//부서별조회
	//IT,Purchsing,Shipping
	
}
