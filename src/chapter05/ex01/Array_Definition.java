package chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/* 
		  자료형 : 변수를 선언할 때 변수에 할당할 값을 정의
		  	- 기본 자료형 : boolean, byte, short, int, long, float, double, char
		  				 메모리의 stack 공간에 변수와 값이 저장됨
		  	- 참조 자료형 : 배열, 열거, 클래스/인터페이스
		  			  	 메모리의 stack 공간에 변수 명과 참조 주소 
		  			  	 변수의 들어갈 값은 Heap영역에 저장됨
		  	변수 : 변수에는 하나의 값만 저장됨
		  	배열 : 1. 배열 변수의 동일한 자료형의 값만 저장할 수 있다. (int, long, double)
   		  		  2. 방의 갯수가 정의되면 수정 불가능 
 		  		  하나의 배열 변수에 많은 값을 저장할 수 있다.
		  		  초기 값을 할당하지 않더라도 강제로 할당됨.
		  		  Heap 영역에는 값이 반드시 할당되어야 함. if not 오류 발생
		  		    - boolean(false), 정수[byte, short, int, long] (0), 실수[float, double] (0.0)		 
		  */
		System.out.println("==================변수==================");
		//1. 변수 - 선언과 동시에 값 할당
		int a = 10;
		
		//2. 변수 - 선언 이후 값 할당
		int b ; 
		b = 20;
		
		// 변수를 선언 후 초기 값을 할당하지 않고 사용하는 경우 오류 발생
		int c;
		int d;
		// int sum = c + d ; //c, d변수에 초기 값을 넣지 않고 사용했으므로 오류 
	
		System.out.println("==================배열: 선언방법 1==================");
		
		//배열 선언과 동시에 방 크기 할당
			int[] array1 = new int [3] ;
			//int[] : 정수 값만 배열에 저장 가능
			//array1 : 배열 변수, array1 변수 명은 stack 공간에 저장이 되며 Heap 영역의 주소 값이 저장
			//new : Heap 영역에 값을 저장하라는 의미
			//int[3] : Heap 영역에 저장할 방의 갯수를 지정
			//							ㄴindex : 방의 번호 = 0, 1, 2, ...
				//배열에 값 할당
				array1[0] =55 ;  //array1의 Heap영역의 주소 0번째 방에 55를 입력
				array1[1] =66 ;
				array1[2] =77 ;
				//배열의 값 출력
				System.out.println("0번째 방의 값 : " + array1[0]);
				System.out.println("1번째 방의 값 : " + array1[1]);
				System.out.println("2번째 방의 값 : " + array1[2]);

			System.out.println("==========배열 : 선언 방법 2==================");
			//선언과 방 번호를 분리해서 정의	
			int[] array2;			//배열 변수 선언
			array2 = new int[5] ;	//선언 이후 배열 변수에 들어갈 방의 갯수 지정
				//array2 배열 변수에 값을 넣고 출력
			array2[0] =32 ;  
			array2[1] =54 ;
			array2[2] =81 ;
			array2[3] =12 ;
			array2[4] =28 ;
			System.out.println("0번째 방의 값 : " + array2[0]);
			System.out.println("1번째 방의 값 : " + array2[1]);
			System.out.println("2번째 방의 값 : " + array2[2]);
			System.out.println("3번째 방의 값 : " + array2[3]);
			System.out.println("4번째 방의 값 : " + array2[4]);
	
			
			//오류 발생 상황
			int array3[] = new int[4] ; 	//index : 0, 1, 2, 3
			//배열 방에 값 넣기
			array3[0] = 10;
			array3[1] = 20;
			array3[2] = 30;
			array3[3] = 40;
			// array3[4] = 50; 				// 오류 : 예외 발생
											// ㄴ 컴파일 시 오류 : 이클립스에서 자동으로 오류 출력
											// ㄴ 실행시 오류 발생 : 예외 처리
			
			//배열의 값 출력
			System.out.println(array3[0]);
			System.out.println(array3[1]);
			System.out.println(array3[2]);
			System.out.println(array3[3]);
			// System.out.println(array3[4]); //실행 오류
			
			
			System.out.println("==========배열 : 선언 방법 3==================");
			
			//배열 선언과 동시에 값 할당
			int [] array5 = new int[] {10, 20, 30, 40, 50};
			//int [] array6 = new int[5] {10, 20, 30, 40, 50}; 
				//오류 발생: 선언과 동시에 배열 변수에 값을 할당할 때 방 크기를 지정하면 오류 발생
			
			array5[3] = 77 ; 
			
			System.out.println(array5[0]);
			System.out.println(array5[1]);
			System.out.println(array5[2]);
			System.out.println(array5[3]);
			System.out.println(array5[4]);
			
			//배열 선언 후 값 할당
			int[] array7 ; 
			array7 = new int[] {100, 200, 300, 400, 500, 600} ;
			
			System.out.println(array7[0]);
			System.out.println(array7[1]);
			System.out.println(array7[2]);
			System.out.println(array7[3]);
			System.out.println(array7[4]);
			System.out.println(array7[5]);
			// System.out.println(array7[6]); 
				// ArrayIndexOutOfBoundsException : 배열의 방 크기를 초과하는 경우 발생하는 오류
			
			System.out.println("==========배열 : 선언 방법 4==================");
			
			//배열 선언과 동시에 값 할당 
			int [] array8 = {11, 22, 33, 44, 55} ;
			
			System.out.println(array8[0]);
			System.out.println(array8[1]);
			System.out.println(array8[2]);
			System.out.println(array8[3]);
			
			//선언과 값을 분리할 시 오류
			int[] array9;
			// array9 = {1,2,3,4,5} ; 오류 발행
			array9 = new int[] {1,2,3,4,5};
			
			
	}

}
