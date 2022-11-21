package chapter07.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 

		//배열 a : 7의 배수를 저장하는 배열 :  1~500
		int [] a = new int [500/7] ;
		
		//a배열 각 방에 7의 배수 저장
		for (int i = 0, j = 7; i<a.length ; i++, j+=7) {
			a[i]=j ; 	//배열 a의 각 방에 7의 배수를 저장
		}
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		//배열 b : 9의 배수를 저장하는 배열 : 1~500
		int [] b = new int [500/9] ;
		
		//b배열 각 방에 9의 배수 저장
		for (int i = 0 , j = 7 ; i<b.length; i++, j+=9) {
			b[i] = j;
		}
		System.out.println(b.length);			//방의 개수 55, 방번호 0~54
		System.out.println(Arrays.toString(b));
		System.out.println("===54번째 방의 값 출력====");
		System.out.println(a[54]);
		System.out.println(b[54]);
		
		//두 배열 각 방의 값을 더해 출력
		System.out.println("===arraySum 메소드 호출====");
		arraySum(a,b) ;
	
	
	}
	//두 배열을 인풋 받아서 각 방의 값을 더해 출력하는 메소드
	public static void arraySum(int[] a, int[] b) {
		int[] c = new int [71] ; // c: 두 배열의 각 방의 값을 더해 저장하는 배열변수
		for (int i = 0; i < a.length ; i++) { //방번호 0~70
			for (int j = 0 ; j<b.length ; j++) {
				if (i >54) {
					c[i] = a[i]+ 0; 
				}
				if (i==j) {
					c[i] = a[i]+b[i];
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
