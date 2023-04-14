package kr.ac.kopo.vo;

//게시판과 관련된 정보를 저장하는 기본단위인 BoardVO
//제목하고 작성자가 필요하겠지
//근데 게시판번호가 바뀌는거 봣나요?
//게시물이 삭제된다고 해도 ...
//그러니까 고유의 정보지?

public class BoardVO {
	
	private int no;
	private String title;
	private String writer;
	private String regDate;
	
//	alt + shift + s
//	다음에 c / o / r / s
	//c 기본생성자
	//o 매개변수 있는 생성자
	//r 게터 세터
	//s toString 메소드
	
	public BoardVO() {
		super();
	}


	public BoardVO(int no, String title, String writer, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + "]";
	}
	
	
	
	

}
