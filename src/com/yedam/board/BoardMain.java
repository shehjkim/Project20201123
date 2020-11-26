package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// 1.리스트 2.상세화면 3.등록 4.삭제 5.수정

		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImpl();
		while(true) {

		System.out.println("----------------------------------");
		System.out.println("1.리스트 2.상세화면 3.등록 4.삭제 5.수정");
		System.out.println("-----------------------------------");
		System.out.println("선택 > ");
		int selectNo = scn.nextInt();

		if (selectNo == 1) {
			List list = service.getBoardList();
			for (Object vo: list) {
				BoardVO board = (BoardVO) vo;
				board.showboardInfo();
			}

		} else if (selectNo == 2) {
			System.out.println("조회 할 게시번호 입력: ");
			int boardNo = scn.nextInt();
			BoardVO boardVo = service.getBoard(boardNo);
			boardVo.showboardInfo();
			
		} else if (selectNo == 3) {
			System.out.println("게시번호를 입력하세요. ");
			int BoardNo = scn.nextInt();scn.nextLine();
			System.out.println("제목을 입력하세요. ");
			String Title = scn.nextLine();
			System.out.println("내용을 입력하세요");
			String Content = scn.nextLine();
			System.out.println("작성자명을 입력하세요. ");
			String Writer = scn.nextLine();
			System.out.println("작성시간을 입력하세요.");
			String Creation_date = scn.nextLine();
			
			BoardVO vo = new BoardVO();
			vo.setBoardNo(BoardNo);
			vo.setTitle(Title);
			vo.setContent(Content);
			vo.setWriter(Writer);
			vo.setCreationDate(Creation_date);
			
			service.insertBoard(vo);
			
			

		} else if (selectNo == 4) {
			System.out.println("삭제할 게시번호를 입력하세요.");
			int boardNo=scn.nextInt();
				
			BoardVO vo = new BoardVO();
			vo.setBoardNo(boardNo);
			
			service.deleteBoard(vo);

				
		} else if (selectNo == 5) {
			System.out.println("수정할 게시번호를 입력하세요.");
			int BoardNo =scn.nextInt();scn.nextLine();
			System.out.println("수정할 제목을 입력하세요.");
			String Title = scn.nextLine();
			System.out.println("수정할 내용을 입력하세요.");
			String Content = scn.nextLine();
			
			BoardVO vo = new BoardVO();
			vo.setBoardNo(BoardNo);
			vo.setTitle(Title);
			vo.setContent(Content);
			
			service.updateBoard(vo);
			

		}

	}
	}
}
