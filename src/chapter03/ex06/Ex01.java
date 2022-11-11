package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) 스캐너로 정수 값을 인풋받고 인풋 받은 정수값이 홀수이면 "홀수", 짝수이면 "짝수"라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a ;

		System.out.println("정수 입력");
		a = sc.nextInt() ;
		
		String b = (a%2 == 1) ? "홀수":"짝수";
		System.out.println(b);	
		
		
		
	}

}
