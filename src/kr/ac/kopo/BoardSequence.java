package kr.ac.kopo;


/**
 * 게시물 번호를 순차적으로 얻어오는 기능 클래스
 * @author User
 *
 */

public class BoardSequence {
	
	//모든 테이블에서 공통적으로 쓰는 요소니까 static인듯!
	private static int boardNo;
	
	//게시글 번호는 1부터 시작이니까 ++추가하고 시작하자!
	public static int getBoardNo() {
		return ++BoardSequence.boardNo;
	}

}
