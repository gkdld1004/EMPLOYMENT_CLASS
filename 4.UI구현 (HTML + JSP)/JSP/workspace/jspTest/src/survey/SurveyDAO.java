package survey;

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

import answer.AnswerDTO;

public class SurveyDAO {

	private DataSource ds;
	private Connection conn;
	private Context init;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static SurveyDAO instance;
	
	private SurveyDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}
	
	public static SurveyDAO getInstance() {
		if(instance == null) {			
			instance = new SurveyDAO();		
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
	
	public List<AnswerDTO> selectAll(){
		
		String sql = "select * from answer order by cdate desc";
		
		ArrayList<AnswerDTO> list = new ArrayList<AnswerDTO>();
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				AnswerDTO dto = new AnswerDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setMnum(rs.getInt("mnum"));
				dto.setCdate(rs.getDate("credate"));
				dto.setContext(rs.getString("context"));
				list.add(dto);
			}
		
			return list;
					
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally { close(); }
		
		return null;
	}
	
	public int insert(int mnum, AnswerDTO dto) {
		
		String sql = "insert into answer (mnum, context) "
				+ "values(?, ?)";
		
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mnum);
			pstmt.setString(2, dto.getContext());
			row = pstmt.executeUpdate();
			return row;
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("고유키 제약 조건 : " + e);
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		return 0;
	}
	
}
