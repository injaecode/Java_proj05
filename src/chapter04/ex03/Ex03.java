package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		// 실습)이중 for문을 사용해 1~9단 출력 print \t
		System.out.println("====print()====");
		for (int i =1 ; i<10;i++) {
			System.out.println(i+"단");
			for (int j = 1 ; j <10 ; j++)
				System.out.print(i + " * " + j + " = " + i*j + "\t" );
			System.out.println();
			System.out.println("\n");
		}
	
		System.out.println("====printf()====");
		for (int i =1 ; i<10;i++) {
			
			System.out.println(i+"단");
			for (int j = 1 ; j <10 ; j++)
				System.out.printf("%d*%d=%d \t" , i, j, i*j );
			System.out.println();
			System.out.println("\n");
		}
			
		}
	
		
			

	
}


