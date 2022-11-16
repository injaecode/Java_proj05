package chapter04.ex04;

public class While_Statement {

	public static void main(String[] args) {
		// while문 : 반복문 (조건이 true일동안 반복, false이면 실행블락을 빠져나옴)
		
		/* 
		 초기값
		 while (조건) {
		 	실행블락;
		 	증감식;
		 	}
		 */
		
		//1. while문의 기본 문법 구조 (증감식을 처리하지 않으면 무한루프)
		int a = 0 ;
		while (a<10) {
			System.out.print(a + " ");
			a++ ;
		}
		System.out.println();
		
		//2. for문으로 변환
		System.out.println("====for문으로 출력====");
		for (a=0 ; a<10 ; a++) {
			System.out.println(a + " ");
		}
		System.out.println();
		
		//while문 -> for문으로 처리  : 100부터 1까지 2씩 감소서 출력
		for (int i = 100 ; i>0 ; i-=2)
			System.out.print(i + " ");
		System.out.println();
		int j=100 ;
		while (j>0) {
			System.out.print(j + " ");
			j-=2;
			
		}
		
		System.out.println();
		System.out.println("=====while에서 무한 루프 =====");
		boolean ab = true;
		int d=0; 			//기본 자료형은 반드시 초기값이 할당되어 있어야 한다.
		while (ab) {
			System.out.println(" 무한 루프 " + d);
			
			if (d>100 ) {
				break;
			}
			d++;
		}
		System.out.println("while문 빠져나옴");
	}

}
