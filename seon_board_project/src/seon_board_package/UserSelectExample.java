package seon_board_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "hr", "12345");
			//매개변수화된 SQL 문 작성
			String sql = ""+"SELECT userid, username, userpassword, userage, useremail "+
			"FROM users " + "WHERE userid=?";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			//SQL 문 실행 후, ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
				System.out.println(user);
			}else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			
			//PreparedStatement 닫기
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();			
		}finally {
			if(conn !=null) {
				try {
					//연결 끊기
					conn.close();
				}catch(SQLException e) {}
			}
		}
	}

}