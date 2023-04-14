package kr.ac.kopo.ui;

public interface IBoardUI {
	
	//실행하는건 모두 execute라는 메소드를 쓰도록 강제.
	//글고 메뉴에서 뭔가 잘못됐을 수가 있으므로(예외 발생)
	//무조건 예외처리를 하도록 간접처리 하게 만드려고 함.
	void execute() throws Exception;
	
	
}
