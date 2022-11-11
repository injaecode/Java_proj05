package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// if문, 스캐너를 사용해 입금액에 따른 교통수단 적용
		// 0~3,000 : 걸어서 다닙니다.
		// 3,000~30,000 : 지하철을 타고 다닙니다.
		// 30,000~100,000 : 택시를 타고 다닙니다.
		// 100,000 ~ : 비행기를 타고 다닙니다.
		
		Scanner sc = new Scanner(System.in) ;
		
		int money ;

		System.out.println("입금액을 입력해주세요.");
		money = sc.nextInt();
		
		if (money<=3000) {
			System.out.println("걸어서 다닙니다.");
		}else if (money>3000 && money<=30000) {
			System.out.println("지하철을 타고 다닙니다.");
		}else if (money>30000 && money<=100000) {
			System.out.println("택시를 타고 다닙니다.");
		}else if (money>100000) {
			System.out.println("비행기를 타고 다닙니다.");
		}
		
	}

}
