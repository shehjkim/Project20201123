package com.yedam.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select*from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("Email"));
				vo.setPhoneNumber(rs.getString("phone_number"));
				vo.setHireDate(rs.getString("Hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select*from emp1 where employee_id=?";
		conn = DAO.getConnection();
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return vo;

	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		sql = "insert into emp1 (employee_id,first_name,last_name,email,"
				+ "		phone_number,hire_Date,job_id,salary) " + "values(?,?,?,?,?,?,?,?)";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getFirstName());
			pstmt.setString(3, vo.getLastName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getPhoneNumber());
			pstmt.setString(6, vo.getHireDate());
			pstmt.setString(7, vo.getJobId());
			pstmt.setInt(8, vo.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

//		return dao.insertEmp(empVo);
	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		
		sql = "update emp1 set employee_id = " + vo.getEmployeeId()
		 + "email = " + vo.getEmail() 
		 + "phone_number = "+ vo.getPhoneNumber()
		 + "salary = " +vo.getSalary()
		 + "where employee_id=" +vo.getEmployeeId() ;

		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println( r + "건4 수정되었습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 한건삭제
	public void deleteEmp(EmployeeVO empVo) {
		conn = DAO.getConnection();
		sql="delete from emp1 where employee_id=";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = 1;
			System.out.println( r + "건 삭제되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
