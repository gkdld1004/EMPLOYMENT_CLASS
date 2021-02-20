package reply2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ReplyDAO {
	
	private DataSource ds;
	private Connection conn;
	private Context init;
	
	private static ReplyDAO instance;
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ReplyDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}
	
	public static ReplyDAO getInstance() {
		if(instance == null) {				// 만약 instance가 없으면
			instance = new ReplyDAO();		// 새로 생성해서
		}									// (이미 있으면 생성하지 않음)
		return instance;					// 반환하기
	}
	
	// finally 블럭에서 처리할 close() 함수
	private void close() {
		try {
			if(rs != null) 		rs.close(); 
			if(pstmt != null) 	pstmt.close();
			if(stmt != null) 	stmt.close();
			if(conn != null) 	conn.close();
		} catch(Exception e) {}
	}
	
	// 댓글 리스트
	public List<ReplyDTO> selectList(int idx){
		
		ArrayList<ReplyDTO> replyList = new ArrayList<ReplyDTO>();
		
		String sql = "select R.*, M.userid, M.username from reply2 R, member2 M" + 
				"    where R.writer = M.idx" + 
//				"        and R.deleted = 0" + 
				"        and R.boardnum =" + idx +
				"    order by R.idx asc";
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// PreparedStatement 에서는 작성된 최종 SQL을 명확하게 확인하기가 번거롭다
			
			while(rs.next()) {
				ReplyDTO dto = new ReplyDTO();
				dto.setIdx(rs.getInt("idx"));				// reply2 의 idx
				dto.setBoardNum(rs.getInt("boardNum"));		// board2 의 idx
				dto.setContext(rs.getString("context"));
				dto.setCredate(rs.getDate("credate"));
				dto.setDeleted(rs.getInt("deleted"));
				dto.setWriter(rs.getInt("writer"));			// member2 의 idx
				dto.setUsername(rs.getString("username"));	// member2 의 username
				dto.setUserid(rs.getNString("userid"));		// member2 의 userid
				replyList.add(dto);
			}
			return replyList;
			
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return null;
	}
	
	// 댓글 작성
	public int insertReply(ReplyDTO user) {
		
		String sql = "insert into reply2 (boardnum, writer, context)" + 
				"    values (?, ?, ?)";
		
		PreparedStatement pstmt = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user.getBoardNum());
			pstmt.setInt(2, user.getWriter());
			pstmt.setString(3, user.getContext());
			int row = pstmt.executeUpdate();
			return row;
		
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return 0;
		
	}
	
	// 댓글 삭제
	public int deleteReply(int idx, String userid) {
		
		String sql = "update reply2 set deleted=%d where idx=%d";
		int deleted = "admin".equals(userid) ? 2 : 1;
		sql = String.format(sql, deleted, idx);
		// 관리자가 삭제하면 값이 2로 변경되고
		// 본인이 삭제하면 값이 1로 변경된다
		// 0이면 삭제되지 않은 데이터이다
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
			return row;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		return 0;
	}
	
}
