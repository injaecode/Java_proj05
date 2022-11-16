package chapter05.ex02;

import java.util.Arrays;

public class Array_Input_Output {

	public static void main(String[] args) {
		// 배열에 값을 넣고 출력하기
		
		System.out.println("======1. 직접 값을 넣고 출력======");
		// 배열 변수 선언 및 방 크기 초기화
		int[] arr1 = new int [5] ;
		
		// 직접 해당 방 번호에 값을 할당
		arr1[0] =10 ;
		arr1[1] =20 ;
		arr1[2] =30 ;
		arr1[3] =40 ;
		arr1[4] =50 ;
		
		//직접 방의 번호를 출력
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2] + " " + arr1[3]+ " " + arr1[4]  );
		
		System.out.println("======2. for문을 사용해 대량으로 값을 넣고 출력======");
		//방 100개 선언, for문을 사용해 각 방에 1부터 1씩 증가
		int [] arr2 = new int [100] ;
		
		//for문을  사용해 값 할당하기 - i: index(방번호)
		for (int i = 0 ; i <100 ; i++) {  //0~99까지 100개의 방
			arr2[i] = i+1;				  //각 방의 값을 자동으로 삽입
		
		//for문을 사용해 할당된 값 출력하기
	
			System.out.print(arr2[i]+" ");
		
			
	
		}
		System.out.println();
		System.out.println("====3. Enhanced For (향상된 for문)====");
		//배열의 각 방의 값을 출력할 때 쉽게 출력		
		//0~마지막 방까지 한꺼번에 출력
		int[] arr3 = new int [100] ;
		//for문을 사용해 7의 배수만 저장
		for (int i = 0 , j =7 ; i <100 ; i++, j+=7) {
			arr3[i] = j ;
			//출력
			System.out.print(arr3[i] + " ");
		}

		for (int k : arr3) {
			System.out.print(k + " ");
		}

		System.out.println();
		System.err.println("=====Arrays.toString(배열변수)=====");
		//Arrays.toString(arr3) : 배열 변수에 저장된 모든 값들을 출력
			//Arrays : 객체
			//toString() : 메소드(함수)
				//메소드 : 객체 지향 언어에서 함수를 메소드(method)라고 함
		System.out.println(Arrays.toString(arr3)); //배열 변수의 값을 출력
		
		System.out.println("========배열의 방 갯수를 출력하는 메소드=========");
		System.out.println(arr1.length); //방 개수 : 5
		System.out.println(arr2.length); //방 개수 : 100
		System.out.println(arr3.length); //방 개수 : 100

		System.out.println("=================");
		for (int i = 0 ; i < arr3.length ;i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
