package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.dao.BoardDAO;

//이름은 UI이지만 추상 클래스...
public abstract class BaseUI implements IBoardUI {
	
//	private String str; //같은 느낌으로
	private Scanner sc;
//	protected BoardDAO boardDao; //실제 호출은 addUI같은 애들이 할거라.
	
	//상속받으면 모두 스캐너 쓸 수 있도록.
	public BaseUI() {
		sc = new Scanner(System.in);
//		boardDao = new BoardDAO();
		
	}
	
	//BaseUI를 상속받은 애들만 쓸 수 있도록,
	//접근제한자를 protected로 할 것임.
	//public이 아니라.
	
	//int타입 반환하는 경우를 위한 메소드
	protected int scanInt(String msg) {
		System.out.print(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	//String타입 반환하는 경우를 위한 메소드
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	

}
