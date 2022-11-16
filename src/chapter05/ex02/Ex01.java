package chapter05.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 실습) arr1 배열 변수에 정수 1000개의 방 생성
		// for문을 사용해 각 방에 3의 배수 값을 저장
		// for문을 사용해 각 방의 내용 출력
		int[]arr1 = new int [1000] ;
		for(int i =0 ; i<1000; i++) {
			arr1[i]=i*3 ;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		for(int i = 0, j=3 ; i<1000 ; i++, j+=3) {
			arr1[i] =j ; 
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

	

	}
}