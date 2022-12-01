package chapter14.ex07;
//1. 사용자정의 일반 예외 (Checked Exception)
class MyException extends Exception{	//Exception 하위클래스 : 일반 예외
	//모든 사용자정의 예외는 Exception을 상속해야 함
	//2개의 생성자 정의
	public MyException() {	//기본 생성자
		super();	//Exception 클래스 객체의 기본 생성자 호출
	}
	public MyException(String message) {	
		super(message);
	}
}
//2. 사용자 정의 실행 예외 (Unchecked Exception, Runtime Exception)
	//RuntimeException을 상속해서 실행예외를 만듦
class MyRTException extends RuntimeException{
	public MyRTException() {	//기본생성자
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}
//사용자 정의 예외를 테스트하는 클래스
class A{
	//1. 사용자 정의 예외 객체 생성 
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지 : MyException");

	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메시지 : MyRTException");
	
	//2. 예외 던지기 (throw): 던진 시점에서 예외 발생
		//throws: 예외를 전가
		//throw : 예외를 발생시킴
	//2-1. 예외를 직접 처리 : try~catch
	
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상 작동");
			}else{
					//throw me1;	//예외 강제 발생 유도
				throw me2;
			}
		}catch (MyException e) {
				System.out.println("사용자 정의 예외 발생");
				System.out.println(e.getMessage());	//Exception 클래스 내의 메시지
		}
	}
		void bcd_1(){
			abc_1(70);
		}
	
	//2-2. 예외 전가
		void abc_2(int num) throws MyException{
			if(num>70) {
				System.out.println("정상작동");
			}else {
				//throw me1;	//예외를 강제로 발생시킴
				throw me2;
			}
		}
		void bcd_2() {
			try {
				abc_2(65);
			} catch (MyException e) {
				System.out.println("사용자 정의 예외 2 발생");
				System.out.println(e.getMessage());
				//e.printStackTrace(); 일반적으로 주석처리, 디버깅시 확인
			}
		}

}



public class CreateUserException {

	public static void main(String[] args) {
		// 사용자 정의 Exception : 사용자가 직접 생성한 예외 
		// Exception을 상속해 직접 예외를 생성할 수 있다.
		//		ex) 점수가 70점 이하이면 예외 발생
		
		//객체 생성 후 사용자 정의 예외 처리 여부 확인
		A a = new A();
		a.bcd_1();
		a.bcd_2();
	}

}
