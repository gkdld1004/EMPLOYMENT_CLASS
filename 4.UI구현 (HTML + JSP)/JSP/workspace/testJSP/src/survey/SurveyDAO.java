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
			System.out.println("생성자 에러 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
	
	public static SurveyDAO getInstance() {
		if(instance == null) {
			instance = new SurveyDAO();
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
	
	// 전체 목록 보기
	public List<SurveyDTO> selectAll(){
		
		String sql = "select * from survey order by regdate desc";

		ArrayList<SurveyDTO> list = new ArrayList<SurveyDTO>();
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				SurveyDTO dto = new SurveyDTO();
				dto.setSidx(rs.getInt("sidx"));
				dto.setRegmember(rs.getInt("regmember"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setContext(rs.getString("context"));
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
	
	// 설문 작성하기
	public int insertSurvey(SurveyDTO dto, int regmember) {
		
		String sql = "insert into survey (context, regmember)"
				+ " values (?, ?)";
		int row = 0;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContext());
			pstmt.setInt(2, dto.getRegmember());
			
			row = pstmt.executeUpdate();
			return row;
			
		} catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("고유키 제약 조건 : " + e);
			return -1;
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return 0;
	}
	
	// 하나보기
	public SurveyDTO selectOne(int sidx) {
		
		String sql = "select * from "
				+ "(select member.name, survey.* from member, survey"
				+ " where member.idx=survey.regmember and survey.sidx=" + sidx + ")";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				SurveyDTO dto = new SurveyDTO();
				dto.setSidx(rs.getInt("sidx"));
				dto.setRegmember(rs.getInt("regmember"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setContext(rs.getString("context"));
				dto.setName(rs.getString("name"));
				return dto;
			}
			
		} catch(SQLException e) {
			System.out.println("SQL Exception : " + e);
		} finally {
			close();
		}
		
		return null;
	}
}
