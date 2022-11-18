package com.son.biz.boardimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.son.biz.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {

	@Autowired
	private SqlSession mybatis;
	
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard",vo);
		mybatis.commit();
	}
	void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard",vo);
		mybatis.commit();
	}
	void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard",vo);
		mybatis.commit();
	}
	BoardVO selectOneBoard(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.selectOneBoard",vo);
	}
	public List<BoardVO> selectAllBoard(BoardVO vo) {
		return mybatis.selectList("BoardDAO.selectAllBoard");
	}
}
