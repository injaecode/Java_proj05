package chapter07.ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		// 메소드의 매개변수(Argument)가 배열
		// 메소드 호출시 Argument로 배열을 넣고 호출
		//1. a 배열을 생성 후 호출
		int [] a = new int[] {1,2,3,4,5};
		printArray(a); //메소드 호출 
	
		System.out.println();
		System.out.println("======================");
		//2. 메소드 호출시에 객체를 생성해서 호출
		printArray(new int[] {6,7,8,9,10}) ;
		
		System.out.println();
		System.out.println("======================");
		//3. 주의 : 오류 발생
	//	printArray({11,12,13,14,15}) ;
		
	
	}
	
	//매개변수로 배열을 인풋받는 메소드
	public static void printArray (int[] a) {
		//1. 배열의 Index = 0 ~ 마지막 방번호까지 for문을 사용해 출력
		
		System.out.println("=====1. for문을 사용해 출력=====");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("=====2. Enhanced for문을 사용해 출력=====");
		for (int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=====3. Arrays.toString()을 사용해 출력=====");
		{
			System.out.print(Arrays.toString(a));
		}
	}

}
