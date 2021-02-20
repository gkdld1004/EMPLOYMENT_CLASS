package board1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection conn;
	private Context init;
	private DataSource ds;
	
	private static BoardDAO instance = new BoardDAO();	
	
	public static BoardDAO getInstance() {	
		return instance;	
	}						
	
	private BoardDAO() {	
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
			
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}

	// 게시글 불러오기 (페이징)
	public HashMap<String, Object> selectAll() {	// 페이지 값을 전달받지 않았으면
		return selectAll(1);			// 1페이지를 전달해서 값을 반환해라
	}
	
 	public HashMap<String, Object> selectAll(int page) {
 		HashMap<String, Object> map = new HashMap<String, Object>();
 		
//		String sql = "select * from board1 order by idx desc";
 		String sql = "select * from board1 " + 
 				"    where idx between %d and %d" + 
 				"    order by idx desc";
 		
 		// 페이징에 필요한 계산
 		int boardCount = selectBoardCount();
 		final int perPage = 10;
 		int pageCount = boardCount / perPage;
 		pageCount += (boardCount % perPage) == 0 ? 0 : 1;
 		int first = boardCount - perPage * (page - 1);
 		int last = first - (perPage - 1);
 		sql = String.format(sql, last, first);
// 		System.out.println(sql);
 		
 		map.put("pageCount", pageCount); 	// 1) 총 페이지 개수를 저장
 		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setContext(rs.getString("context"));
				dto.setCreationDate(rs.getDate("creationDate"));
				dto.setIdx(rs.getInt("idx"));
				dto.setIpaddr(rs.getString("ipaddr"));
				dto.setTitle(rs.getString("title"));
				dto.setViewCount(rs.getInt("viewCount"));
				dto.setWriter(rs.getString("writer"));
				list.add(dto);
			}
			map.put("list", list);
			return map;	// 1) 총페이지 개수 2) 불러온 게시글의 리스트
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) 		rs.close(); 
				if(pstmt != null) 	pstmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		return null;
	}

	
 	// 총 게시글의 개수를 가져오기
 	public int selectBoardCount() {
 		String sql = "select count(*) from board1";
 		Statement stmt = null;
 		ResultSet rs = null;
 		int count = 0;
 		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				count = rs.getInt(1);
				return count;
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) 		rs.close();
				if(stmt != null) 	stmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		return 0;
 	}
 	
	// 게시글 하나 가져오기
	public BoardDTO selectOne(int idx) {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from board1 where idx=" + idx;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setContext(rs.getString("context"));
				dto.setCreationDate(rs.getDate("creationDate"));
				dto.setIdx(rs.getInt("idx"));
				dto.setIpaddr(rs.getString("ipaddr"));
				dto.setTitle(rs.getString("title"));
				dto.setViewCount(rs.getInt("viewCount"));
				dto.setWriter(rs.getString("writer"));
				return dto;
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) 		rs.close(); 
				if(stmt != null) 	stmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		return null;
	}




}
