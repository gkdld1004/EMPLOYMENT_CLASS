package com.itbank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	private DataSource ds;
	private Connection conn;
	private Context init;
	private static MemberDAO instance;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// finally 블럭에서 처리할 close() 함수
	private void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {}
	}
	
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
		if(instance == null) {				// 만약 instance 가 없으면 
			instance = new MemberDAO();		// 새로 생성해서
		}									// (이미 있으면 생성하지 않음)
		return instance;					// 반환하기
	}
	
	// 회원가입 (비밀번호를 해시처리하여 저장하기)
	public int insertMember(MemberDTO dto) {
		
		String sql = "insert into member2 (userid, userpw, username, gender, email) "
				+ "values (?, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		int row = 0;
				
		// conn, (stmt or pstmt), (rs or row)
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, Hash.getHash(dto.getUserpw()));	// Hash처리된 userpw의 값
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			row = pstmt.executeUpdate();
			return row;
		} catch(SQLIntegrityConstraintViolationException e) {
			// 중복된 ID를 이용하여 가입을 시도했다
			System.out.println("고유키 제약 조건 위배 : " + e);
			return -1;
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return 0;
	}

	// 로그인 (id와 pw를 이용해서 일치하는 계정 찾아오기)
	public MemberDTO selectOne(MemberDTO dto) {
		
		MemberDTO login = new MemberDTO();
		
		String sql = "select * from member2 where userid=? and userpw=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, Hash.getHash(dto.getUserpw()));		// 사용자 입력값 기반 해시값
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				login.setUserid(rs.getNString("userid"));
				login.setUserpw(rs.getString("userpw"));
				login.setUsername(rs.getString("username"));
				login.setEmail(rs.getString("email"));
				login.setGender(rs.getString("gender"));
				login.setIdx(rs.getInt("idx"));
				return login;
			}
			
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return null;
	}
	
	// id 찾기
	public MemberDTO findMyId(MemberDTO user) {
		
		MemberDTO find = new MemberDTO();
		
		String sql = "select * from member2 where username=? and email=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getEmail());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				find.setUsername(rs.getString("username"));
				find.setEmail(rs.getString("email"));
				find.setUserid(rs.getString("userid"));
				return find;
			}
			
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return null;
	}

	public String selectID(Map<String, String[]> map) {
		
		String sql = "select userid from member2 where username=? and email=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, map.get("username")[0]);
			pstmt.setString(2, map.get("email")[0]);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String userid = rs.getString("userid");
				return userid;
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		
		return null;
	}

	public int updatePassword(MemberDTO dto) {
		
		String sql = "update member2 set userpw=? where userid=? and username=? and email=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserpw());
			pstmt.setString(2, dto.getUserid());
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getEmail());
			int row = pstmt.executeUpdate();
			return row;
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		
		return 0;
	}
}
