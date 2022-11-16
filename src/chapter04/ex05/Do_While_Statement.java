package chapter04.ex05;

public class Do_While_Statement {

	public static void main(String[] args) {
		// do ~ while문: 실행문을 조건과 상관없이 한 번은 실행을 시킨 후 조건에 따라 반복
		// cf) while문은 조건에 만족 해야지만 실행블락 실행.
		
		/* 
		 초기식
		 do {
		 	실행블락 ; 
		 	증감식 ;
		 } while (조건) ; 
		 
		 */
		
		//1. while문
		int a = 0; 
		while (a<0) { //조건이 false이므로 실행 블락이 실행되지 않음
			System.out.println(a + " ");
	
		}
		
		//2. do ~ while문
		 a = 0; 
		 do {
			 System.out.println(a + " ");
			
		 } while (a<0) ;	//조건 무관 1회 실행
		 
		 //3. 반복 횟수가 10번인 경우 while문 - do while문 비교
	
		 a = 0;
		 while (a<10) {
			 System.out.print(a + " ");
			 a++ ;
		 }
		 System.out.println();
		 System.out.println("==========");
		 a = 0;
		 do {
			 System.out.print(a + " ");
			 a++ ;
		 } while (a<10) ;
		
	}
}
