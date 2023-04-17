package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.BoardSequence;
import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {

	//ui => service 호출, Service => 여러개의 VO? 호출 => UI에 반환
	//일반적으로는 VO 하나가 테이블을 의미하게 됨.(??DAO가 아니라 VO?)
	//DAO가 맞을듯!
	
	private BoardDAO boardDao;
	
	public BoardService() {
		boardDao = new BoardDAO();
	}
	
	public void insertBoard(BoardVO board) {
		
		//확인용
//		System.out.println("----service----");
//		System.out.println(board);
		
		//게시글 번호 저장
		//사실DB는 따로 문법이 있어서 이렇게 쓸 일이 없지만
		//파일이나 램(?)이나 딴데 저장하려면 이렇게 써야 함. 일부러~
		board.setNo(BoardSequence.getBoardNo());
		
		//현재날짜 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		board.setRegDate(sdf.format(new Date()));
		
		//반영후 확인용
//		System.out.println(board);
		
		
		//데이터가 다 저장해지면 이제 boardDao로 넘겨주는 거!!!
		boardDao.insertBoard(board);
	}
	
	public List<BoardVO> selectAll() {
		//위에 add 때는 모자란 값(no, regDate)을 service에서 채워서 Dao에게 넘겨줬지만
		//지금은 service가 할일은 없음 걍 Dao가 가진 값을 넘겨주기만 하면 됨.
		List<BoardVO> boardList = boardDao.selectAllBoard();
		return boardList;
	}
	
	
}
