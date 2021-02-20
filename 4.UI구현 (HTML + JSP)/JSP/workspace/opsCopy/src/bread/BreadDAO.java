package bread;

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

public class BreadDAO {

	private DataSource ds;
	private Connection conn;
	private Context init;
	private static BreadDAO instance;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {}
	}
	
	private BreadDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
			
		} catch(Exception e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			if(conn != null) try { conn.close(); } catch (Exception e) {}
		}
	}
	
	public static BreadDAO getInstance() {
		if(instance == null) {
			instance = new BreadDAO();
		}
		return instance;
	}
	
	public List<BreadDTO> selectAll() {
		
		ArrayList<BreadDTO> list = new ArrayList<BreadDTO>();
		
		String sql = "select * from bread1 order by idx desc";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BreadDTO dto = new BreadDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setBname(rs.getString("bname"));
				dto.setBprice(rs.getInt("bprice"));
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
