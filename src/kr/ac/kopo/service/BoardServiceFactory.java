package kr.ac.kopo.service;

//DAO를 호출하는 Service를 하나로 통합하기 위해서
//new new 안하고
public class BoardServiceFactory {
	
	//BoardService가 이미 만들어져있는지 아닌지 확인하기 위해서
	private static BoardService service = null;
	
	
	public static BoardService getInstance() {
		
		//객체가 없으면 새로.
		if(service == null) {
			service = new BoardService();
		}
		
		//있으면 있던거 그대로
		return service;

		
	}

}
