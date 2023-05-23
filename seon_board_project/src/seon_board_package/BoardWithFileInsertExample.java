package seon_board_package;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {
		public static void main(String[] args) {
			Connection conn = null;
			try {
				//JDBC Driver를 메모리로 로딩하고, DriverManager에 등록
				Class.forName("oracle.jdbc.OracleDriver");
				
				//DB와 연결
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521/xe", "hr", "12345");
				//매개변수화된 SQL 문 작성
				String sql = "" +
						"INSERT INTO boards(bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"+
						"VALUES (SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?)";
				
				//PreparedStatement 얻기 및 값 지정
				PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
				pstmt.setString(1, "크리스마스");
				pstmt.setString(2, "크리스마스네요");
				pstmt.setString(3, "christmas");
				pstmt.setString(4, "christmas.jpg");
				pstmt.setBlob(5, new FileInputStream("src/seon_board_package/snow.jpg"));
				
				//SQL 문 실행
				int rows = pstmt.executeUpdate();
				System.out.println("저장된 행 수 :"+rows);
				
				//bno 값 얻기
				if(rows == 1) {
					ResultSet rs = pstmt.getGeneratedKeys();
					if(rs.next()) {
						int bno = rs.getInt(1);
						System.out.println("저장된 bno: "+bno);
					}
					rs.close();
				}
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