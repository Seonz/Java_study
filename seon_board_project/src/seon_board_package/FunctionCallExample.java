package seon_board_package;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FunctionCallExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB와 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "hr", "12345");
			//매개변수화된 SQL 문 작성
			String sql = "{? = call user_login(?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			// ? 값 지정 및 리턴 타입 지정
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, "winter");
			cstmt.setString(3,"12345");
			
			//함수 실행 및 리턴값 얻기 
			cstmt.execute();
			int result = cstmt.getInt(1);
			
			//CallableStatement 닫기
			cstmt.close();
			
			//로그인 결과(Switch Expressions 이용)
			String message = switch(result) {
			case 0 -> "로그인 성공";
			case 1 -> "비밀번호가 틀림";
			default -> "아이디가 존재하지 않음";
			};
			System.out.println(message);
		}catch (Exception e) {
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
