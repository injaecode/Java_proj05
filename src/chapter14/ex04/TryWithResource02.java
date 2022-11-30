package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource02 {

	public static void main(String[] args) {
		// Try with Resource : Java 1.7~
		// 일반적인 Try 구문 : try{} catch (Exception e) {}
		
			//try(객체선언[Resource]) {} catch (Exception e) {}
			//자동으로 객체를 close() 
			//자동으로 객체를 제거하기 위해서는 AutoClosable() 인터페이스를 구현한 클래스만이 자동으로 제거됨
		
	
		//예외를 직접처리
		//1. 자동으로 객체를 제거하는 예제
		System.out.println("한 글자를 입력하세요>>>");
		try (InputStreamReader ir1=new InputStreamReader(System.in);){	
			char input = (char)ir1.read();
			System.out.println("입력한 글자는 : " + input);
		}catch(IOException e) {
			System.out.println("IOException이 발생되었습니다.");
		}
		//finally블락에 close()메소드를 사용하지 않더라도 자동으로 close()됨
	}

}
