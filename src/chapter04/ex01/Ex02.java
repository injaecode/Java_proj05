package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 실습) 번호 입력 프로그램 작동시키기
		
		System.out.println("=============");
		System.out.println("1. 학점의 합계와 평균 | 2. 홀짝 | 3. 같은 이름 판별 ");
		System.out.println("=============");
		
		Scanner sc= new Scanner(System.in);
		int select ;
		
		System.out.println("번호를 입력하세요.");
		select = sc.nextInt() ;
		
		int kor; 
		int eng; 
		int math; 
		int a ;
		
		String aName;
		String bName;
		
		if (select==1) { 
			System.out.println("국어 과목의 학점을 입력하세요.");
			kor = sc.nextInt();
			System.out.println("영어 과목의 학점을 입력하세요.");
			eng = sc.nextInt();
			System.out.println("수학 과목의 학점을 입력하세요.");
			math = sc.nextInt();
		
			int sum = kor + eng + math ;
			double avg = sum/3.0 ;
			
			System.out.println("세 과목 학점의 합계는 " + sum + "입니다");
			System.out.println("세 과목 학점의 평균은 " + avg + "입니다");
		
		}else if (select==2) {
			System.out.println("숫자를 입력하세요.");
			a = sc.nextInt();
			
			String b = (a%2 ==1) ? "홀수":"짝수" ;
			System.out.println(b);
		}else if (select==3) {
			System.out.println("A이름을 입력하세요.");
			aName = sc.next();
			
			System.out.println("B이름을 입력하세요.");
			bName = sc.next();
			System.out.println(aName.equals(bName)?"같은 이름입니다.":"다른 이름입니다.");
		}else { System.out.println("다시 입력해주세요.");
	
		}
	
	
		
	}

}
