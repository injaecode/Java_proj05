package chapter14.ex02;

public class TryCatchFinally {

	public static void main(String[] args) {
		/*	예외를 처리하는 방법
		  		1. 직접 예외 처리: try catch finally를 사용해 처리
		  		2. 예외 전가: throws를 사용해 메소드 마지막에 예외 객체 불러옴
		  					메소드를 호출하는 곳에서 예외 처리
		 */
		
		//1. try ~ catch
		try {
			//try 블락에서 예외가 발생되면 catch블락의 코드를 실행함
			//예외가 발생되지 않으면 catch블락은 실행되지 않음
			System.out.println(3/0);//실행 예외 : ArithmeticException
		} catch (Exception e) {
			//try블락에서 ArithmeticException이 발생 되었을 때 작동
			System.out.println("try 블락에서 오류가 발생했습니다.");
		}
		System.out.println("========try catch finally==========");
		
		//2. try~catch~finally
		try {
			System.out.println(3/2);
			System.out.println("try 블락에 생성된 구문");
		}catch (ArithmeticException e) {	//try에서 예외 발생 시 실행
			System.out.println("숫자 0으로 나눌 수 없습니다.");
		}finally {	//try블락에서 예외 발생 여부와 관계 없이 반드시 실행되는 구문
			System.out.println("finally 블락 : 반드시 실행");
		}
		
		
		System.out.println("프로그램의 마지막입니다.");
		
	
	}
	

}
