package com.kh.tresure.member.model.service;


import java.util.HashMap;

import com.kh.tresure.member.model.vo.Member;


public interface MemberService {

	// 로그인 및 회원가입 하는 메소드
	public Member loginAndMemberEnroll(Member member);
}
