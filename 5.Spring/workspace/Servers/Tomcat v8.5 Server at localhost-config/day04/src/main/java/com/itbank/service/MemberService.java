package com.itbank.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.itbank.member.Hash;
import com.itbank.member.MemberDAO;
import com.itbank.member.MemberDTO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	public int insertMember(HashMap<String, String> param) {
		String userpw = param.get("userpw");
		String userpw2 = param.get("userpw2");
		
		if(userpw.equals(userpw2)) {
			return memberDAO.insert(param);
		}
		
		return -1;		// -1 을 받으면 비밀번호가 서로 일치하지 않는다라는 약속
	}

	public MemberDTO getMember(MemberDTO dto) {
		
		dto.setUserpw(Hash.getHash(dto.getUserpw()));
		
		MemberDTO login = memberDAO.selectMember(dto);
		
		return login;
	}

	public int updateMember(HashMap<String, String> param) {
		String userpw = param.get("userpw");
		String userpw3 = param.get("userpw3");
		String userpw4 = param.get("userpw4");
		String userpw5 = param.get("userpw5");
		
		if(userpw3.equals(userpw4)) {
			if(userpw5.equals(userpw5)) {
				return memberDAO.update(param);
			}
		}
		
		return -1;
	}

	
	

}
