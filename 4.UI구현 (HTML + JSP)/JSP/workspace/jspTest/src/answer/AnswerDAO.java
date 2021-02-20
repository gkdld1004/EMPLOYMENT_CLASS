package answer;

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

public class AnswerDAO {
	
	private DataSource ds;
	private Connection conn;
	private Context init;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static AnswerDAO instance;
	
	private AnswerDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}
	
	public static AnswerDAO getInstance() {
		if(instance == null) {			
			instance = new AnswerDAO();		
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
	
	public List<AnswerDTO> selectList(int idx){
		ArrayList<AnswerDTO> list = new ArrayList<AnswerDTO>();
		
		String sql = "select member.id, member.name, survey.* from member, answer" 
				+ " where member.idx=answer.idx and survey.answer.idx=" + idx;
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				AnswerDTO dto = new AnswerDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setMnum(rs.getInt("mnum"));
				dto.setContext(rs.getString("context"));
				dto.setCdate(rs.getDate("cdate"));
				list.add(dto);
			}
			return list;
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return null;
	}
}
