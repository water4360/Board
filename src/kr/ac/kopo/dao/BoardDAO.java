package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {
	
	//게시글이 저장될 게시판!!!
	private List<BoardVO> boardList;

	public BoardDAO() {
		boardList = new ArrayList<>();
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	//반환타입이 BoardVO List인거고
	public List<BoardVO> selectAllBoard() {
		return boardList;
		
	}

}
