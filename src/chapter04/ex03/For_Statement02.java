package chapter04.ex03;

public class For_Statement02 {

	public static void main(String[] args) {
		//For문의 특수한 형태 (무한 루프)
		// - for문에서 조건이 생략될 경우 무한 루프
		/*
		for (int i = 0 ;; i++) {
			System.out.println(i + " "); //조건이 생략되어 무한 루프 -> 메모리 풀 -> 서버 다운될 수 있음
		} 
		*/
		
		// - 초기식, 조건, 증감식이 모두 빠진 경우도 무한루프
		/*
		 for (;;) {
		 	System.out.println("무한루프) ;
		 */
		
		for (int i = 0 ; ; i++) {
		System.out.print(i+" ");
		if (i> 100) {
			break; 					//break;는 if조건과 같이 사용한다.
		}
		}
		
	}

}
