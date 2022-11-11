package chapter03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		
		System.out.println("정수 입력");
		a = sc.nextInt();
		
		String b = (a%3 == 0) ? "3, 6, 9의 배수입니다":"3, 6, 9의 배수가 아닙니다";
		
		System.out.println(b);
	}

}
