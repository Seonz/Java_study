package seon_board_package;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
					
			//DB와 연결
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe", "hr", "12345");
			//매개변수화된 SQL 문 작성
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			//SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 :"+rows);
			
			//PreparedStatement 닫기
			pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(conn !=null) {
					try {
						//연결 끊기
						conn.close();
					}catch (SQLException e ) {}
			}
		
		}
	}

}
