package chapter04.ex03;

public class For_Statement03 {

	public static void main(String[] args) {
		// 이중 for문 : for문 내에 for문 구성
		// for문을 사용해 구구단 출력
		
		// 바깥쪽 for는 단을 출력하는 변수
		for (int i= 1 ; i<10 ; i++) {
			System.out.println(i + "단 출력");
			for (int j = 1 ; j<10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}

}
