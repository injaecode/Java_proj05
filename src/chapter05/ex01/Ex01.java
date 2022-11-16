package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) 배열 선언 4가지 방법
		// <<배열선언1>> 배열 변수 이름 : arr1, 정수로 방 3개 지정, 40, 50, 60 넣고 출력 
			int [] arr1 = new int[3] ;
			arr1[0] =40 ;
			arr1[1] =50 ;
			arr1[2] =60 ;
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
			
		// <<배열선언2>> 배열 변수 이름 : arr2, 실수로 방 5개 지정, 44.0, 50.0, 60.0 ... 넣고 출력
			double[] arr2 ; 
			arr2 = new double[5] ;
			arr2[0] =44.0 ;
			arr2[1] =50.0 ;
			arr2[2] =60.0 ;
			arr2[3] =70.0 ;
			arr2[4] =80.0 ;		
			
			System.out.println(arr2[0]);
			System.out.println(arr2[1]);
			System.out.println(arr2[2]);
			System.out.println(arr2[3]);
			System.out.println(arr2[4]);
			
		// <<배열선언3>> 배열 변수 이름 : arr3, 문자열 3, "오늘", "날씨", "흐림" 넣고 출력
			String [] arr3 = new String[] {"오늘", "날씨", "흐림"} ;
			System.out.println(arr3[0]);
			System.out.println(arr3[1]);
			System.out.println(arr3[2]);
			
		// <<배열선언4>> 배열 변수 이름 : arr4, 문자 3, 'A', 'B', 'C' 넣고 출력
			char [] arr4 = {'3', 'A', 'B', 'C'} ;
			System.out.println(arr4[0]);
			System.out.println(arr4[1]);
			System.out.println(arr4[2]);
			System.out.println(arr4[3]);
			
	}

}
