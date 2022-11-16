package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// 실습) 이중 for문을 사용해 3의 배수단 출력 (19단까지 출력)
		
		for (int i = 3 ; i <20; i+=3) {
			System.out.println("3의 배수단 출력");
			for (int j = 1 ; j<20 ; j++) {
				System.out.println(i + " * " + j + " = " +i*j);	
			}
			
		}

		//1. 1~19단 출력
		for (int i = 1 ; i<20 ; i++ ) {
			System.out.println(i + "단 출력");
			for (int j =1 ; j<20 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			
			}
			
		}
		//2. 3의 배수단 출력
		for (int i = 3 ; i<20 ; i+=3 ) {
			System.out.println(i + "단 출력");
			for (int j =1 ; j<20 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
		
		}
	}		
		
		
		}

}
