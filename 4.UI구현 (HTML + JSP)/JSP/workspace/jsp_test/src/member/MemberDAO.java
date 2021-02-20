package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	
	private DataSource ds;
	private Connection conn;
	private Context init;
	private static MemberDAO instance;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {}
	}
	
	public MemberDAO() {
		
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			System.out.println("생성자 예외 : " + e);
			e.printStackTrace();
		} finally {
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
	
	public static MemberDAO getInstance() {
		if(instance == null) {
			instance = new MemberDAO();
		}
		return instance;
	}
	// 회원가입
	public int insertMember(MemberDTO user) {
		
		String sql = "insert into member (id, password, name, gender, email)"
				+ " values (?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, Hash.getHash(user.getPassword()));
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getEmail());
			row = pstmt.executeUpdate();
			
			return row;
			
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("고유키 제약 조건 위배 : " + e);
			return -1;
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}
	// 로그인
	public MemberDTO login(MemberDTO user) {
		
		MemberDTO login = new MemberDTO();
		String sql = "select * from member where id = ? and password = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, Hash.getHash(user.getPassword()));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				login.setIdx(rs.getInt("idx"));
				login.setId(rs.getString("id"));
				login.setPassword(rs.getString("password"));
				login.setName(rs.getString("name"));
				login.setGender(rs.getString("gender"));
				login.setEmail(rs.getString("email"));
				
				return login;
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}
	// 설문 아이디 !!!
	public String selectOne(int idx) {
		String sql = "select * from member where idx=" + idx;
		MemberDTO dto = new MemberDTO();
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dto.setId(rs.getString("id"));
				return dto.getId();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}
}
