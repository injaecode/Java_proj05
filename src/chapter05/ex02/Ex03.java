package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방번호를 인풋받습니다.
		// 배열 변수 : arr1, 2의 배수
		// 배열 변수 : arr2, 3의 배수
		// arr1.length : 배열의 방 개수를 자동으로 알아옴

		Scanner sc = new Scanner(System.in) ;

		int a ; // 방의 개수를 지정받는 변수
		System.out.println("출력할 방 개수를 입력하세요");
		
		a = sc.nextInt();
		
		int [] arr1 = new int [a];
		int [] arr2 = new int[a] ;
		
		for (int i =0, j=2; i <arr1.length ; i++, j+=2) {
			 arr1[i]=j ;	
			 }
		for (int i =0 , j=3 ; i<arr2.length ; i++, j+=3) {
			arr2[i] = j ;
		 }
		
		System.out.println("======Enhanced for문을 사용해 2의 배수 출력=====");
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("======for문을 사용해 3의 배수 출력=====");
		for (int i = 0 ; i < arr2.length; i++) {
			System.out.print(arr2[i] +" ");
		
		}
		
		sc.close();
		
	}

}
