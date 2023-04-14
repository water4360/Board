package kr.ac.kopo;

import kr.ac.kopo.ui.BoardUI;

public class BoardMain {

	public static void main(String[] args) {
		
		//다른 객체의 메소드들이 던진 예외를 한번에 처리!
		try {
			//실행 테스트용
			new BoardUI().execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
