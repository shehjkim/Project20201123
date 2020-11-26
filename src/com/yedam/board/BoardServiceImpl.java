package com.yedam.board;

import java.util.List;

public class BoardServiceImpl implements BoardService{
	
	BoardDAO dao = new BoardDAO();

	@Override
	public List getBoardList() {
		return dao.getBoardList();
		
	}

	@Override
	public BoardVO getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public void insertBoard(BoardVO boardVo) {
		 dao.insertBoard(boardVo);
		
	}

	@Override
	public void deleteBoard(BoardVO boardVo) {
		 dao.deleteBoard(boardVo);
		
	}

	@Override
	public void updateBoard(BoardVO boardVo) {
		dao.updateBoard(boardVo);
		
	}
	
	
	
	

}
