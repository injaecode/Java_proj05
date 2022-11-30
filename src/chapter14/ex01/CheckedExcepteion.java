package chapter14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A {	//A객체를 복사, throws
	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class CheckedExcepteion {

	public static void main(String[] args) {
		//예외(Exception): 프로그램 작성 중 문제 발생 시 프로그램 종료 차단
			//1. 일반 예외(Checked Exception)
					//이클립스에서 예외를 처리하고 알려줌
			//2. 실행 예외(Unchecked Exception, Runtime Exception)
					//컴파일 단계에서 확인이 안되고 실행시 발생되는 예외
	
	
	//*일반 예외: 컴파일 단계에서 예외 필요 알림 
	//1. InterrupedException: 인터럽트가 발생했을 때 예외 처리
//		Thread.sleep(1000);//쓰레드 작동 중지
	//2. ClassNotFoundException: 클래스를 찾지 못했을때 발생하는 예외
//		Class cls = Class.forName("java.lang.Object");
	//3. IOException: Input, Output 시 발생되는 예외 
		//객체의 참조변수 선언
		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
	//4. FileNotFoundException: 파일을 찾을 수 없을 때 발생되는 예외
//		FileInputStream fis = new FileInputStream("test.txt");
	//5. CloneNotSupportedException: 객체를 클론(복사)할 수 없는 예외 발생
		A a1 = new A();
//		A a2 = (A)a1.Clone(); //a1 객체를 복사해서 a2객체로 생성
	}

}
