package chapter07.ex02;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개변수로 배열을 Argument로 인풋
		// 1~100까지 3의 배수의 배열을 생성 후 메소드 호출, 정수 : 5
		
		int [] a = new int[100/3] ;
		 for (int i = 0 , j =3 ; i<a.length; i++, j+=3) { //i: 방번호, j : 3의 배수 저장
			 a[i]=j;
		 }
		 //3의 배수 출력
		 System.out.println("====3의 배수 출력=====");
		 for (int i = 0 ; i < a.length ; i++) {
			 System.out.print(a[i] + " ");
		 }
		 System.out.println();
		 System.out.println("====================");
		 
		 //메소드 호출
		 System.out.println("3의 배수 배열에 각 방 값 *5 출력");
		 printArray(a, 5) ;
		 
		 
		// 1~100까지 7의 배수 배열을 생성한 후 메소드 호출, 정수 : 2
			int [] b = new int[100/7] ;
			 for (int i = 0 , j =7 ; i<b.length; i++, j+=7) { //i: 방번호, j : 3의 배수 저장
				 a[i]=j;
			 }
			 //3의 배수 출력
			 System.out.println("====7의 배수 출력=====");
			 for (int i = 0 ; i < b.length ; i++) {
				 System.out.print(b[i] + " ");
			 }
			 System.out.println();
			 System.out.println("====================");
			 
			 //메소드 호출
			 System.out.println("7의 배수 배열에 각 방 값 *2 출력");
			 printArray(b, 2) ;
			 
			 System.out.println("1부터 200까지 9의 배수만 저장후 출력");
			 int [] c = MultiArray(200, 9) ;
			 System.out.println("====200까지 9의 배수 출력");
			 for (int i = 0 ; i <c.length; i++) {
			 System.out.print(c[i] + " ");
			 }

	
}
	//메소드 : static, 매개변수로 정수 1개, 배열 1개 인풋
	// 각 방의 배열 값에 인풋된 정수를 곱해 출력하는 메소드 생성
	public static void printArray(int[] a, int b) {
		for(int i = 0; i<a.length;i++) { 		//배열의 각방에 들어오는 정수를 곱해서 출력
				System.out.print(a[i]*b+ " ");;				

		}
		System.out.println();
	}

	
	public static int[] MultiArray (int maxCount, int multi) {
		int[] a = new int[maxCount/multi] ;
		for (int i = 0, j =1; i<a.length; j++) { //j배수를 저장하는 변수
			if (j%multi==0) {					// j/multi==0 ; multi 배수일때만 j값을 배열 a에 저장
				a[i] = j ;
				i++;
			}
		
		}
		return a;
	}
}
