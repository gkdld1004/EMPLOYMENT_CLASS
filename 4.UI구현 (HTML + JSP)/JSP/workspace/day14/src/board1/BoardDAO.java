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

//	// 게시글 불러오기 (페이징)
//	public HashMap<String, Object> selectAll() {	// 페이지 값을 전달받지 않았으면
//		return selectAll(1);			// 1페이지를 전달해서 값을 반환해라
//	}
	
 	public HashMap<String, Object> selectAll(int page) {
 		HashMap<String, Object> map = new HashMap<String, Object>();
 		
//		String sql = "select * from board1 order by idx desc";
 		
// 		String sql = "select rownum, board1.* from board1" + 
// 				"    where idx between %d and %d" + 
// 				"    order by idx desc";
 		
 		String sql = "select * from " + 
 				"    (select rownum as st, A.* from " + 
 				"        (select * from board1 order by idx desc)" + 
 				"    A where rownum <= %d) " + 
 				"where st >= %d";
 		
 		// 페이징에 필요한 계산
 		int boardCount = selectBoardCount();
 		final int perPage = 10;		// 한 페이지에 출력하는 글의 개수
 		int pageCount = boardCount / perPage;
 		pageCount += (boardCount % perPage) == 0 ? 0 : 1;
 		
 		int first = (page - 1) * perPage + 1;
 		int last = first + perPage - 1;
 		
 		final int perSection = 10;	// 하나의 섹션에서 출력하는 페이지 번호의 개수
 		int section = (page - 1) / 10;	// (1 ~ 10 : 0), (11 ~ 20 : 1), (21 ~ 30 : 2) ...
 		int begin = 10 * section + 1;		// (0, 1),  (1, 11), (2, 21)
 		int end = begin + perSection - 1;	// (0, 10), (1, 20), (2, 30)
 		end = end > pageCount ? pageCount : end;	// 총 페이지수보다 큰 값은 출력하지 않는다
 		
 		boolean prev = section != 0;	// 이전 섹션으로 이동하는 링크를 출력하는지에 대한 조건
 		boolean next = boardCount > perPage * end;	// 다음 섹션으로 이동하는 링크 출력할지에 대한 조건
 		
 		sql = String.format(sql, last, first);
// 		System.out.println(sql);
 		
// 		map.put("pageCount", pageCount); 	// 1) 총 페이지 개수를 저장
 		map.put("section", section);
 		map.put("begin", begin);
 		map.put("end", end);
 		map.put("prev", prev);
 		map.put("next", next);
 		
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

	// 새 글 작성(작성된 글의 idx를 반환)
	public int insertBoard(BoardDTO write) {
		String sql = "insert into board1 (title, writer, context, ipaddr) "
				+ "values (?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, write.getTitle());
			pstmt.setString(2, write.getWriter());
			pstmt.setString(3, write.getContext());
			pstmt.setString(4, write.getIpaddr());
			row = pstmt.executeUpdate();
			if(row == 1) {
				return selectMaxIdx();
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) 	pstmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		
		return 0;
	}

	// idx값 중 가장 높은 값을 반환
	private int selectMaxIdx() {
		String sql = "select max(idx) from board1";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				return rs.getInt(1);
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
	
	// 글 삭제
	public int delete(int idx) {
		String sql = "delete board1 where idx=" + idx;
		
		Statement stmt = null;
		int row = 0;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
			return row;
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) 	stmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		
		return 0;
	}

	// 조회수 증가
	public int updateViewCount(int idx) {
		String sql = "update board1 set viewCount = viewCount + 1 where idx = " + idx;
		Statement stmt = null;
		int row = 0;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
			return row;
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) 	stmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		
		return 0;
	}
	
	
	// 수정 
	public int updateBoard(BoardDTO dto) {
		String sql = "update board1 set title=?, writer=?, context=?, ipaddr=? where idx=?";
		PreparedStatement pstmt = null;
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContext());
			pstmt.setString(4, dto.getIpaddr());
			pstmt.setInt(5, dto.getIdx());
			row = pstmt.executeUpdate();
			if(row == 1) {
				return dto.getIdx();
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) 	pstmt.close(); 
				if(conn != null) 	conn.close(); 
			} catch(Exception e) {}
		}
		
		return 0;
	}
	
}





