package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Employee;

public class J06_DataModelClass {
	
	/*
	 	# 데이터 모델 클래스
	 	
	 	- DB에서 꺼낸 데이터를 담아놓는 용도로 사용하는 클래스
	 	- 데이터를 매개변수 등으로 활용하기 편리한 형태
	 	- DTO, VO 등으로 불리기도 한다
	 */
	
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try (
			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
		) {
			
			// 테이블의 한 행을 인스턴스화 해놓으면 Collection에도 활용할 수 있다
			List<Employee> employees = new ArrayList<>();
			
			while (rs.next()) {
				// 꺼낸 데이터를 인스턴스화 해놓으면 여기저기 사용하기 편리해진다
				Employee emp = new Employee(
					rs.getInt("employee_id"),
					rs.getString("first_name"),
					rs.getString("last_name"),
					rs.getString("email"),
					rs.getString("phone_number")
				);
				
				System.out.println(emp);
			}
			System.out.println(employees);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
