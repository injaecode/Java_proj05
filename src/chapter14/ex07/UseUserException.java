package chapter14.ex07;
//사용자 정의 예외 : 일방 예외 2개 생성
//1. 값이 음수이면 예외를 발생시키는 사용자정의 예외
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
//2. 값이 100을 초과하는 경우 예외 시키는 사용자정의 예외
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

//사용자정의 예외를 처리할 클래스
class Aa{
	void checkScore(int score) throws MinusException, OverException {
		if(score<0) {	//MinusException 강제 호출
			throw new MinusException("예외 발생 : 음수 값 입력 불가");//일반 예외
		}else if(score>100) {	//OverException 강제 호출
			throw new OverException("예외 발생 : 100 초과 값 입력 불가");//일반 예외
		}else {
			System.out.println("정상 값입니다.");
		}
	}
}

public class UseUserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa aa=new Aa();
		try {
			aa.checkScore(1000);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
