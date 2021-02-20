package joinboard;

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

public class JoinBoardDAO {

	private DataSource ds;
	private Connection conn;
	private Context init;
	private static JoinBoardDAO instance;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {}
	}
	public JoinBoardDAO() {
		try {
			init = (Context)new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	public static JoinBoardDAO getInstance() {
		if(instance == null) {
			instance = new JoinBoardDAO();
		}
		return instance;
	}
	public List<JoinBoardDTO> selectList(int idx){
		ArrayList<JoinBoardDTO> list = new ArrayList<JoinBoardDTO>();
		String sql = "select member.id, member.name, joinboard.* from member, joinboard"
				+ " where member.idx=joinboard.useridx and joinboard.bdidx=" + idx;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				JoinBoardDTO dto = new JoinBoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setUseridx(rs.getInt("useridx"));
				dto.setBdidx(rs.getInt("bdidx"));
				dto.setAnswer(rs.getString("answer"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				list.add(dto);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}
	// 응답 수
	public int countAll(int idx) {
		String sql = "select count(*) from"
				+ " (select member.id, member.name, joinboard.* from member, joinboard"
				+ " where member.idx=joinboard.useridx and joinboard.bdidx=" + idx + ")";
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("joinboard countAll idx : " + idx);
			
			while(rs.next()) {
				int count = rs.getInt(1);
				return count;
			}
		} catch (SQLException e) {
			System.out.println("countAll : " + e);
		} finally {
			close();
		}
		return 0;
	}
	// y/n
	public int selectAnswer(int idx) {
		String sql = "select count(*) from"
				+ " (select member.id, member.name, joinboard.* from member, joinboard"
				+ " where member.idx=joinboard.useridx and joinboard.bdidx=%d"
				+ " and joinboard.answer='yes')";
		
		sql = String.format(sql, idx);
		int result = 0;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				result = rs.getInt(1);
			}
			return result;
		} catch (SQLException e) {
			System.out.println("selectAnswer : " + e);
		} finally {
			close();
		}
		return 0;
	}
	// 추가
	public int insertJoinBoard(JoinBoardDTO dto) {
		String sql = "insert into joinboard (bdidx, useridx, answer)"
				+ " values (%d, %d, %s)";
		String.format(sql, dto.getBdidx(), dto.getUseridx(), dto.getAnswer());
		int row = 0;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
			return row;
	} catch(SQLException e) {
		System.out.println("insertJoinBoard : " + e);
	} finally {
		close();
	}
		return 0;
	}
}
