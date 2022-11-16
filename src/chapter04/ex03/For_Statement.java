package chapter04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		// For 문: 조건이 true일 동안 실행블락을 반복해서 처리, 조건이 false이면 For문을 빠져나온다.
		/* 
		 	for (초기값;조건;증감식) {
		 		실행블락 ;				 		
		 	}	
		 */
		//1. For문의 기본 구조 (println)
		int a; 
		for (a=0; a<3 ; a++) {
			System.out.println(a);
		} 				// 0, 1, 2
		
		for (int b = 0 ; b <100 ; b+=2) { 	//변수b : 지역번수: for블락 내에서만 사용됨
			System.out.print(b + " ");
		}
		
		//int a ; 전역 변수, 위에서 선언했으므로 재선언 불가능
		for (a = 0 ; a < 20 ; a +=3) {
			System.out.print(a + " ");
		
		}
		System.out.println();
		System.out.println("===========");
		for (int b = 0 ; b <20 ; b+=4) {
		System.out.print(b + " ");	
		
		}
		System.out.println();
		System.out.println("===========");
		// 초기값 100부터 1씩 빼면서 0까지 도출
		for (int i = 100 ; i >0 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===========");
		
		for (int i =1000; i >0 ; i -=3) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		System.out.println("===========");
		
		//여러개의 변수를 초기식 및 증감식에서 처리 가능
		for (int i =0 , j = 0 ; i<100; i++, j++) {
			System.out.println(i+", "+j);
		}
		
	
	}

}
