package database_;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection1 {
	public static void main(String[] args) {
		SQLConnector c = new SQLConnector();
    }
}

// 연결테스트
class SQLConnector{
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";
	
	// 생성자
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
}



