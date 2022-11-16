package com.son.biz.member;

import java.util.List;

public interface MemberService {
	void insertMember(MemberVO vo);
	void deleteMember(MemberVO vo);
	MemberVO selectOneMemberVO(MemberVO vo);
	List<MemberVO> selectAllMember(MemberVO vo);
	
}
