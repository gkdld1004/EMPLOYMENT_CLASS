package com.itbank.member;

import java.sql.ResultSet;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private JdbcTemplate jt;
	
	// 회원가입
	public int insert(HashMap<String, String> param) {
		
//		String sql = "insert into member2 (userid, userpw, username, gender, email)"
//				+ " values ('%s', '%s', '%s', '%s', '%s')";
		String sql = "insert into member2 (userid, userpw, username, gender, email)"
				+ " values (?, ?, ?, ?, ?)";
		
		sql = String.format(sql, 
				param.get("userid"),
				Hash.getHash(param.get("userpw")),
				param.get("username"),
				param.get("gender"),
				param.get("email"));
		
		return jt.update(sql,
					param.get("userid"), Hash.getHash(param.get("userpw")),
					param.get("username"), param.get("gender"), param.get("email"));
	}

	// 로그인
	public MemberDTO selectMember(MemberDTO dto) {
		
//		String sql ="select * from member2 where userid='%s' and userpw='%s'";
		String sql ="select * from member2 where userid=? and userpw=?";
		
		
		sql = String.format(sql, 
				dto.getUserid(), dto.getUserpw());
		
		// jt.query(sql, rowMapper) 			: sql을 실행하여 결과가 여러줄인 경우 리스트로 반환한다
		// jt.queryForObject(sql, rowMapper)	: sql을 실행하여 결과가 반드시 한 줄이여야 하고, 단일 객체로 반환한다
		// jt.update(sql)						: sql을 실행하여 반영된 줄 수를 정수로 반환한다
		
		// jt.queryForObject()는 반드시 한줄을 반환한다.
		// 만약 결과가 없다면 예외를 발생시킨다. 두 개 이상이여도 예외를 발생시킨다.
		
		
		RowMapper<MemberDTO> rowMapper = (ResultSet rs, int row) -> {
			MemberDTO m = new MemberDTO();
			m.setUserid(rs.getString("userid"));
			m.setUsername(rs.getString("username"));
			m.setEmail(rs.getString("email"));
			m.setGender(rs.getString("gender"));
			return m;
		};
		
		MemberDTO login = jt.queryForObject(sql, rowMapper, dto.getUserid(), dto.getUserpw());
		
		return login;
	}

	public int update(HashMap<String, String> param) {
		
		String sql = "update member set userpw3=? where userpw=?";
		
		sql = String.format(sql, 
				Hash.getHash(param.get("userpw3")), 
				Hash.getHash(param.get("userpw")));
		
		return jt.update(sql, Hash.getHash(param.get("userpw3")),
				Hash.getHash(param.get("userpw")));
	}



	
}
