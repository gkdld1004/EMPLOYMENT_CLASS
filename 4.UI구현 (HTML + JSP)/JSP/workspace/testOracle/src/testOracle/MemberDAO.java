package testOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url = "jdbc:oracle:thin:@localhost:51521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 로드할 수 없습니다 : " + e);
		} catch(SQLException e) {
			System.out.println("지정한 DB에 접속할 수 없습니다 : " + e);
		}
	}
	
	public ArrayList<MemberDTO> getMemberList() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "select * from member";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				dto.setIdNumber(rs.getString("idnumber"));
				dto.setName(rs.getString("name"));
				list.add(dto);
			}
			return list;
		} catch(SQLException e ) {
			System.out.println("SQL 예외발생 : " + e);
		} catch(NullPointerException e) {
			System.out.println("널 포인터 : " + e);
			e.printStackTrace();
		} finally {
			try { if(rs != null) {rs.close();}} catch(Exception e1) {}
			try { if(stmt != null) {stmt.close();}} catch(Exception e1) {}
			try { if(conn != null) {conn.close();}} catch(Exception e1) {}
		}
		return null;
	}
	
	public int insertMember(MemberDTO dto) {
		
		String sql = "insert into member values('%s', '%s', '%d', '%s')";
		sql = String.format(sql, dto.getIdNumber(), dto.getName(), dto.getAge(), dto.getGender());
		
		try {
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} catch(NullPointerException e) {
			System.out.println("널 포인터 : " + e);
			e.printStackTrace();
		} finally {
			try { if(rs != null) { rs.close(); }} catch(Exception e1) {}
			try { if(stmt != null) { stmt.close(); }} catch(Exception e1) {}
			try { if(conn != null) { conn.close(); }} catch(Exception e1) {}
		}
		return 0;
	}
	
}
