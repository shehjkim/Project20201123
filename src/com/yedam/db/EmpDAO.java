package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = getConnection();
	
	public void inserEmployee (Employee emp) {
		String sql = "Insert Into emp1(last_name,email,job_id,hire_date) "
				+ "VALUES (?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getLastName());
			psmt.setString(2, emp.getEmail());
			psmt.setString(3, emp.getJobId());
			psmt.setString(4, emp.getHireDate());
			int r = psmt.executeUpdate(); 			   //insert,update,delete(dml)
			System.out.println(r + "건이 입력됨. ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Employee[] getEmpList() {
		String sql = "select*from emp1";
		Employee[] emps = new Employee[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("Phone_Number"));
				emp.setHireDate(rs.getString("hire_Date"));
				emp.setJobId(rs.getString("job_Id"));
				emp.setSalary(rs.getInt("salary"));
				emps[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emps;
	}

	public Department[] getDepList() {
		String sql = "select*from departments";
		Department[] deps = new Department[100];
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();
				dep.setDepartment_Id(rs.getInt("department_id"));
				dep.setDepartment_Name(rs.getString("department_name"));
				dep.setManager_Id(rs.getInt("manager_id"));
				dep.setLocation_Id(rs.getInt("location_id"));
				deps[i++] = dep;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deps;

	}

	public static Connection getConnection() // connection 타입의 값이 반환
	{
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}
}
