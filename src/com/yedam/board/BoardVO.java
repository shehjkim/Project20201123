package com.yedam.board;

public class BoardVO {

	private int BoardNo;
	private String Title;
	private String Content;
	private String Writer;
	private String CreationDate;


	

	public BoardVO(int boardNo, String title, String content, String writer, String creationDate) {
		super();
		this.BoardNo = boardNo;
		this.Title = title;
		this.Content = content;
		this.Writer = writer;
		this.CreationDate = creationDate;
	}

	public BoardVO() {
	}

	public int getBoardNo() {
		return BoardNo;
	}

	public void setBoardNo(int boardNo) {
		BoardNo = boardNo;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}

	public void showboardInfo() {
		System.out.println("게시판번호: " + BoardNo + " " + "제목: " + Title + " " + "콘텐츠: " + Content + " " + "작성자: " + Writer
				+ " " + "작성일자: " + CreationDate + " ");
	}

}
