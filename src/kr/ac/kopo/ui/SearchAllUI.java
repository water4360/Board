package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;
import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI {
	//전체글을 아는건 DAO
	//요청은 서비스에!
	//그럼 서비스가 DAO에게 전체 글을 알려조~

	private BoardService boardService;
	
	public SearchAllUI() {
//		boardService = new BoardService(); //매번 new하지말고.
		boardService = BoardServiceFactory.getInstance();
	}
	
	@Override
	public void execute() throws Exception {
		//전체글 조회니까 매개변수는 필요없지
		//하지만 반환값은 vo겠지
		//근데 vo 1개야? 여러개지? 그러니까 list형태로 날아오겠지
		//자 이제 Service로 가서 selectAll() 메소드를 만들러가자!
		List<BoardVO> boardList = boardService.selectAll();
		
		System.out.println("------------------------------------------");
		System.out.println("NO\t글쓴이\t등록일\t\t제목");
		System.out.println("------------------------------------------");
		
		//만약 데이터가 하나도 없으면?
		if(boardList == null || boardList.size() == 0) {
			System.out.println("\t게시글이 존재하지 않습니다");
		} else {
			//있다면 출력!
			for(BoardVO board : boardList) {
				System.out.println(board.getNo() + "\t" 
								+ board.getWriter() + "\t" 
								+ board.getRegDate() + "\t" 
								+ board.getTitle());
			}
		}
		
		
	}

}
