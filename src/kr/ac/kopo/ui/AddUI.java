package kr.ac.kopo.ui;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class AddUI extends BaseUI {

	private BoardDAO boardDao;
	
	
	//원래라면 BaseUI에 넣어서 상속시켰겠지만
	//이해를 돕기위해 매 UI마다 추가해주심.
	public AddUI() {
		boardDao = new BoardDAO();
	}


	@Override
	public void execute() throws Exception {
		
		//게시글 하나를 볼 수 있기위해 객체화 해봅시다
		//그럼 그 게시글을 클래스로 정의할 수 있지 않을까?
		//제목, 작성자, 내용 등!
		//BoardDTO, BoardVO = 정보를 저장하는 단위(?)
		//DTO = Data Terminal Object 
		//VO = Value Object
		
		//UI는 진짜 딱 안내 메세지만 보여주는 그런거.
		
		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("글쓴이를 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		boardDao.insertBoard(board);
		
		System.out.println("새 글 등록을 완료하였습니다");
	}


	

}
