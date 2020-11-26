package com.yedam.board;

//1.리스트 2.상세화면 3.등록 4.삭제 5.수정
import java.util.List;

public interface BoardService {

	public List getBoardList(); // 리스트

	public BoardVO getBoard(int boardNo); // 상세화면

	public void insertBoard(BoardVO boardVo); // 등록

	public void deleteBoard(BoardVO boardVo); // 삭제

	public void updateBoard(BoardVO boardVo); // 수정

}
