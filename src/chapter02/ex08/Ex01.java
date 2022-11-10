package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fam = new Scanner (System.in);
		
		String moname ;
		String faname ;
		String broname ;
		String myname;
		int moage;
		int faage;
		int broage;
		int myage;
		
		System.out.println("어머니 성함을 입력하세요");
		moname = fam.next();
		System.out.println("아버지 성함을 입력하세요");
		faname = fam.next();
		System.out.println("형제의 성함을 입력하세요");
		broname = fam.next();
		System.out.println("본인의 성함을 입력하세요");
		myname = fam.next();
		System.out.println("어머니 나이를 입력하세요");
		moage = fam.nextInt();
		System.out.println("아버지 나이를 입력하세요");
		faage = fam.nextInt();
		System.out.println("형제의 나이를 입력하세요");
		broage = fam.nextInt();
		System.out.println("본인의 나이를 입력하세요");
		myage = fam.nextInt();
		
		int sum = moage + faage + broage + myage ;
		double avg = sum / 4.0 ;
		
		System.out.println("==================");
		System.out.println("나의 부모님 성함은 " + moname + "," + faname + "이고, " + "오빠의 이름은 " + broname +"입니다.");
		System.out.println("우리 가족 나이의 합은 " + sum + "입니다.");
		System.out.println("나이 평균은 " + avg + "입니다.");
		
	}

}
