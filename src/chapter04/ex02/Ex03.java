package chapter04.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in) ;
		
		int month;
		int day=30 ;
		System.out.println("월을 입력해주세요.");
		month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			
			day += 1;
			break ;
		case 2:
			day -= 2;
		default :
			
		}
		System.out.println(month + " 월은 " + day +" 일 입니다.");
	}

}
