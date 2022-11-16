package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 실습) 배열변수 : arr1, 배열의 방 500개, 3 또는 5의 배수를 저장
				// 1. for, 2.Enhanced for, Arrays.toString()을 사용해 출력
		
		int [] arr1 = new int [500] ;
		for (int i=0, j=1; i<500; i++, j++) {
			if (j%3==0 || j%5==0) {
				
						arr1[i] = j ; 
				System.out.print(arr1[i]+ " ");
			}	
		
		}
		
		System.out.println();
		System.out.println("=======");

		for (int k: arr1) {
		
			System.out.print(k+ " ");	

		}
		
		System.out.println();
		System.out.println("=======");
		System.out.println(Arrays.toString(arr1)) ;	
	
		System.out.println();
		System.out.println("===========예시답안=======");
		
		int i=0;
		int[] arr2 = new int[500] ;
		for (int a=1; a<3000;a++) {
			if (a%3==0 ||a%5==0) {
				arr2[i] = a;
				i++;
			}
			if (i>499) {
				break;
			}
		}
				
		System.out.println("====for문으로 출력====");
		for (i = 0 ; i <500; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		System.out.println("=====Enhenced for=====");
		for (int k : arr2) {
			System.out.printf("%d ", k);
		}
		System.out.println();
		System.out.println("=====arrays.toString=====");
		System.out.println(Arrays.toString(arr2)) ;	
				
	

	}

}
