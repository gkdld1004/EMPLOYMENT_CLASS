package upboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UpBoardDAO {

	private DataSource ds;
	private Connection conn;
	private Context init;
	private static UpBoardDAO instance;
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
	
	public UpBoardDAO() {
		try {
			init = (Context)new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			System.out.println("생성자 예외 : " + e);
			e.printStackTrace();
		} finally {
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
	
	public static UpBoardDAO getInstance() {
		if(instance == null) {
			instance = new UpBoardDAO();
		}
		return instance;
	}
	
	// 전체출력
	public List<UpBoardDTO> selectAll() {
		ArrayList<UpBoardDTO> list = new ArrayList<UpBoardDTO>();
		String sql = "select * from upboard order by createdate desc";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				UpBoardDTO dto = new UpBoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setUseridx(rs.getInt("useridx"));
				dto.setCreateDate(rs.getDate("createdate"));
				dto.setContext(rs.getString("context"));
				list.add(dto);
			}
			return list;
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}
	
	public int insertUpBoard(int idx, UpBoardDTO dto) {
		String sql = "insert into upboard (useridx, context)"
				+ " values (?, ?)";
		int row = 0;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, dto.getContext());
			row = pstmt.executeUpdate();
			System.out.println("insertUpboard useridx : " + idx);
			return row;
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("고유키 제약 위배 : " + e);
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}
	
	public UpBoardDTO selectOne(int idx) {
		String sql = "select * from"
				+ " (select member.id, member.name, upboard.* from member, upboard"
				+ " where member.idx=upboard.useridx and upboard.idx=" + idx + ")";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("upboard selectOne idx : " + idx);
			while(rs.next()) {
				UpBoardDTO dto = new UpBoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setUseridx(rs.getInt("useridx"));
				dto.setContext(rs.getString("context"));
				dto.setCreateDate(rs.getDate("createdate"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				return dto;
			}
			
		} catch (SQLException e) {
			System.out.println("UpBoard selectOne : " + e);
		} finally {
			close();
		}
		return null;
	}
}
