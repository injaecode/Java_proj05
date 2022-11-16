package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) do while 문으로 무한 루프를 돌립니다.
		//  	스캐너를 사용해 각 번호 입력시 해당 실행값 출력
		

				
		int a ;
		
		Scanner sc = new Scanner(System.in) ; 
		
	
		
		do {
			System.out.println("===================================================");
			
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			
			System.out.println("===================================================");
			System.out.println("위 번호를 입력하세요.");
			
			a= sc.nextInt() ; 
			
			if (a==1) {
			System.out.println("1. 평균 출력");
			
			}else if (a==2) { 
				System.out.println("2. 합계 출력");
			
			}else if (a==3) {
				System.out.println("3. 합계 출력");
				
			}else if (a==4){ 
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 번호입니다. 1~4까지만 입력해주세요.");
			}
			
		}while (true) ;
		System.out.println("do while문을 빠져나왔습니다.");
	}
}