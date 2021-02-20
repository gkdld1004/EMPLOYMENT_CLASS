package member1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	private DataSource ds;
	private Connection conn;
	private Context init;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static MemberDAO instance;
	
	private MemberDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}
	
	public static MemberDAO getInstance() {
		if(instance == null) {			
			instance = new MemberDAO();		
		}		
		return instance;
	}
	
	private void close() {
		try {
			if(rs != null) 		rs.close(); 
			if(pstmt != null) 	pstmt.close();
			if(stmt != null) 	stmt.close();
			if(conn != null) 	conn.close();
		} catch(Exception e) {}
	}
	
	public int insertMember(MemberDTO dto) {
		
		String sql = "insert into member1 (id, pw, name, gender, email) values (?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, Hash.getHash(dto.getPw()));
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			row = pstmt.executeUpdate();
			return row;
			
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("고유키 제약 조건 위배 : " + e);
			return -1;
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return 0;
	}
	
	public MemberDTO selectOne(MemberDTO dto) {
		
		String sql = "select * from member1 where id=? and pw=?";
		
		MemberDTO login = new MemberDTO();

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, Hash.getHash(dto.getPw()));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				login.setId(rs.getString("id"));
				login.setPw(rs.getString("pw"));
				login.setName(rs.getString("name"));
				login.setEmail(rs.getString("email"));
				login.setGender(rs.getString("gender"));
				login.setIdx(rs.getInt("idx"));
				return login;
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally { close(); }
		
		return null;
	}

}

