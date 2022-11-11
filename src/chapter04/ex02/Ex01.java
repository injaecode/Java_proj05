package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) switch문을 사용하여 프로그램을 작성하세요.
		// 스캐너로 1을 인풋받으면 "금메달입니다."
		// 		  2을 인풋받으면 "은메달입니다."
		//        3을 인풋받으면 "동메달입니다."
		//        그 외 값을 인풋받으면 "메달이 없습니다."
		
		Scanner sc = new Scanner(System.in) ;
		int medal ;
		System.out.println("등수를 입력하세요.");
		medal = sc.nextInt();
		
		switch (medal) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			
		}
		
		System.out.println("=================");
		//실습2) 
		System.out.println("메달의 색을 영어로 입력해 주세요");
		String medal2;
		
		medal2 = sc.next();
		switch (medal2) {
		case "gold": case "Gold": case "GOLD":
			System.out.println("금메달입니다.");
			break;
		case "silver":
			System.out.println("은메달입니다.");
			break;
		case "bronze" : 
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
		
		}
	
		sc.close();
		
	}

}
