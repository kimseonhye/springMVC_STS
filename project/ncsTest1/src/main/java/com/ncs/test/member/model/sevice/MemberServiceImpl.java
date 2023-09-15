package com.ncs.test.member.model.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncs.test.member.model.dao.MemberDAO;
import com.ncs.test.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	public Member loginMember(Member login) {
		
		return memberDAO.loginMember(login);
	}

}
