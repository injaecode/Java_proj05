package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 2차 정방형 배열
		
		//1. 배열의 선언
		int[][] arr1 = new int [5][100] ;
		System.out.println(arr1.length) ; //행의 개수 =5 
		System.out.println(arr1[0].length) ; //0행의 열 개수 = 100
		
		//2. 2차원 배열의 값 넣기: 이중 for(for-for)문을 사용해 값 넣기
		//행을 정의 : i(index) = 방번호, arr1.length = 행의 개수
		for (int i = 0 ; i < arr1.length ; i++) {
			//열을 정의 : j = 열의 방번호, arr1[i].length
			for(int j = 0, a=0; j<arr1[i].length; j++, a++) {
				arr1[i][j]= a+1 ;
			}
		}
		//3. 배열의 값을 출력하기 (for-for)
		for (int i = 0 ; i<arr1.length ; i++) {
			for (int j = 0 ; j<arr1[i].length ; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("========enhanced for문으로 출력=========");
		//4. Enhanced for문을 사용해 값 출력
		for (int[] k : arr1) { 	//arr1의 루프를 돌면서 행을 꺼내와서 k변수에 할당
			for (int b : k) {	//일차원 배열의 각 방의 값을 꺼내 와서 b변수에 담는다.
				System.out.print(b + " ");
			}
			System.out.println();
		}
		//5. Arrays.toString() : 일차원 배열의 값을 출력
		for (int[] z : arr1) {
			System.out.println(Arrays.toString(z));
		}
	}

}
