package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 실습
		// 2차원 배열 변수 arr1
		// arr1[0] <= 2의 배수만 저장
		// arr2[1] <= 5의 배수만 저장
		// arr3[2] <= 3의 배수와 8의 배수 저장
		// arr4[3] <= 1부터 1씩 증가, 7의 배수 제외
		
		//행의 개수 4
		//열의 개수 100
		
		int arr1[][] = new int[4][100] ;

		for (int i = 0 ; i<arr1.length;i++) {
			if (i==0) {
				for (int j = 0, a=1 ; j<arr1[i].length;a++) {
					if(a%2==0) {
					arr1[i][j] = a ;
					j++ ;
					}
				}
			}else if (i==1) {
				for (int j = 0, a=1 ; j<arr1[i].length;a++) {
					if(a%5==0) {
					arr1[i][j] = a ;
					j++ ;
					}
				}
			}else if (i==2) {
				for (int j = 0, a=1 ; j<arr1[i].length;a++) {
					if(a%3==0 || a%8==0) {
					arr1[i][j] = a ;
					j++ ;
					}
				}
			}else if (i==3) {
				for (int j = 0, a=1 ; j<arr1[i].length;a++) {
					if(a%7!=0) {
					continue;
					}
					arr1[i][j] = a ;
					j++ ;
				}
			}
		}
		
		System.out.println("=========for문을 사용해 출력=======");
			for (int i = 0 ; i <arr1.length;i++) {
				for (int j = 0; j <arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("====Enhanced for 문을 사용해서 내용 출력 =====");
			for ( int[] a : arr1) {
				for (int b : a) {
					System.out.print( b + " ");
				}
				System.out.println();
			}

			System.out.println("====Arrays.toString()를 사용해서 내용 출력 =====");
			for ( int[] a : arr1) {
				System.out.println(Arrays.toString(a));
				
			}
	}
}