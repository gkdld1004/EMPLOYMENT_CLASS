package answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			System.out.println("생성자 에러 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
	
	public static AnswerDAO getInstance() {
		if(instance == null) {
			instance = new AnswerDAO();
		}
		return instance;
	}
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {}
	}
	
	public int countAll(int idx) {
		
		String sql = "select count(*) from"
				+ " (select member.name, answer.* from member, answer "
				+ " where member.idx=answer.membernum and answer.answernum=" + idx + ")";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int count = rs.getInt(1);
				return count;
			}
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		return 0;
	}
	
	public int selectAnswer(int idx) {
		
		String sql = "select count(*) from "
				+ " (select member.name answer.* from member, answer "
				+ " where member.idx=answer.membernum and answer.answernum=%d"
				+ " and answer.reply='yes')";
		
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
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e );
		} finally {
			close();
		}
		
		return 0;
	}
	
}
