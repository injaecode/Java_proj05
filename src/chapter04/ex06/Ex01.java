package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습)스캐너로 인풋 받은 값을 선택 시 해당 내용을 출력 하세요 (이중 for문 사용)
		//프로그램 종료시까지 무한 루프 작동, 이외의 번호를 선택시 "잘못된 입력입니다. 1~4까지만 입력해주세요."
		
		Scanner sc = new Scanner(System.in);	
		
	
	
		int a ;
		do {
			
				System.out.println("===================================================================");
				System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수단만 출력 | 4. 프로그램 종료");
				System.out.println("==================================================================");
				System.out.println("위 번호를 선택하세요.");
			a = sc.nextInt() ;
		
			if (a==1) {
			System.out.println("1. 구구단 출력"); ;
			
			for (int i =1 ; i < 10 ; i++) {
				System.out.println(i + "단");
				for (int j=1 ; j<10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
					}
				}
			
			}else if (a==2) {
				System.out.println("2. 19단 출력");
				for (int i = 1 ; i<20 ; i++ ) {
					System.out.println(i + "단 출력");
					for (int j =1 ; j<20 ; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
				}
			} else if (a==3) {
				System.out.println("3. 19단 중 7배수단만 출력");
				for  (int i = 1; i<20 ; i++ ) {
					if (i%7 ==0) {
					System.out.println(i + "단 출력");
					
					for (int j =1 ; j<20 ; j++) {
					
						System.out.println(i + " * " + j + " = " + i*j);
					}
					}
				}
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4까지만 입력해주세요.");
			}
			
		}while (true) ;
		System.out.println("do while문을 빠져나왔습니다.");
		}
	
}

		
	
		
