package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 실습) 스캐너를 사용해 1~12월까지 입력, 해당 월의 일 수를 출력
		Scanner sc = new Scanner(System.in) ;
		
		int month ;
		int day = 30;
		
		System.out.println("원하는 달의 일자 수를 검색하세요");
		month = sc.nextInt() ;
		
		
		switch (month) {
		case 1: case 3: case 5:  case 7:  case 8:  case 10:  case 12:  
	
		System.out.println(month + "월은 " + (day+1) +"일까지 입니다.");
		day =sc.nextInt();
		break;
		
		case 2:
			System.out.println(month + "월은 " + (day-2) +"일까지 입니다.");
			day =sc.nextInt();
			break;	
			
		case 4:	case 6: case 9: case 11:
			System.out.println(month + "월은 " + day +"일까지 입니다.");
			day =sc.nextInt();
			break;	
		}
		
	}

}
