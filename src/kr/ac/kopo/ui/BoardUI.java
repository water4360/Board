package kr.ac.kopo.ui;

import java.util.Scanner;

public class BoardUI extends BaseUI {
	
	
	
	private int menu() {
		System.out.println("*** 게시판 관리 프로그램 ***");
		System.out.println("1. 전체게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.print("원하는 항목을 선택하세요 >> ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		sc.nextLine(); //버퍼 비우기용
		
		return type;
	}
	
	
	//전체메뉴 보여주는 메소드
	@Override
	public void execute() throws Exception {
		
		while(true){
			int type = menu();
			IBoardUI ui = null;
			
			switch(type) {
			case 1 :
//				AddUI add = new AddUI();
				System.out.println("전체게시글 조회 선택");
				break;
			case 2 : 
				System.out.println("글번호 조회 선택");
				ui = new SearchOneUI();
				break;
			case 3 :
				System.out.println("글등록 선택");
//				AddUI add = new AddUI();
//				add.execute();
//				new AddUI().execute(); //이렇게 줄일 수도.
				ui = new AddUI();
				break;
			case 4 : 
				System.out.println("글수정 선택");
				break;
			case 5 : 
				System.out.println("글삭제 선택");
				break;
			case 0 :
//				ExitUI exit = new ExitUI();
//				exit.execute();
//				new ExitUI().execute();
				ui = new ExitUI();
				break;
			}//switch
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
			
		}//while
		
	}

}
