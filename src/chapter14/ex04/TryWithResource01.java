package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {

	public static void main(String[] args) {
		// Try 구문에서 리소스 자동해제, 객체 사용 후 객체를 제거(close())해 반드시 메모리 최적화
		// 객체 사용후 finally블락에서 객체를 제거함
		
		System.out.println("문자를 입력하세요.");
		//1. 리소스 수동 해제: finally블락에서 객체를 close() 메소드를 호출해서 객체를 메모리에서 제거
		
		//콘솔을 사용해서 문자열을 입력받도록 하는 클래스 : InputStreamReader
		InputStreamReader ir1 = null;
		
		//일반예외(Catched Exception): 프로그램 작성시 컴파일 단계에서 오류
		//반드시 예외를 처리해야 한다.
			//1. 예외를 전가 :throws를 사용해 호출하는 쪽에서 처리하도록 미루는 방법
			//2. 예외를 직접 처리: try - catch 블락을 만들어서 처리
		ir1 = new InputStreamReader(System.in);
		
		try{
			char input = (char) ir1.read();
			System.out.println("입력한 글자는 : "+input);
		} catch(IOException e) {
			System.out.println("IOException이 발생했습니다. 하나의 문자만 입력해주세요");
			e.printStackTrace();
		}finally {
			//일반적으로 객체를 사용후 finally블락에서 객체를 제거함
			//객체를 제거할때도 예외처리가 되어야함
			if(ir1 !=null) {
				try{
					ir1.close();
				}catch (IOException e) {
					System.out.println("객체 제거시 예외 발생");
					e.printStackTrace();
				}
			}
		}
		
	}

}
