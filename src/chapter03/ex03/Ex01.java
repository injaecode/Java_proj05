package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 정수 2개를 Scanner로 인풋받고 두 값이 같으면 true, 다르면 false 출력
		// 이름 2개를 Scanner로 인풋받고 두 값이 같으면 true, 다르면 false 출력
		
		Scanner ab = new Scanner (System.in) ;
		
		// 등가 연산자 사용
			//기본자료형 : ==
		int a ;
		int b;
		
		System.out.println("a의 값을 입력하세요. >>>");
		a = ab.nextInt() ;
		System.out.println("b의 값을 입력하세요. >>>");
		b = ab.nextInt() ;
		System.out.println(a==b);
		
		//참조자료형 : aName.equals(bName)
		String aName ;
		String bName ;
		
		System.out.println("이름을 입력하세요 >>>");
		aName = ab.next();
		System.out.println("이름을 입력하세요 >>>");
		bName = ab.next();
		System.out.println(aName.equals(bName));
	}

}
