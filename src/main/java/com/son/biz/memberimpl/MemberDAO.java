package com.son.biz.memberimpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.son.biz.member.MemberVO;

@Repository("MemberDAO")
public class MemberDAO {

	@Autowired
	private SqlSession mybatis;
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	public MemberVO selectOneMember(MemberVO vo) {
		return mybatis.selectOne("MemberDAO.selectOneMember", vo);
	}
	
}
