package chapter01.ex03;

public class DataType {

	public static void main(String[] args) {
		// 변수 생성 후 출력하기
		// 변수 선언 전에 변수에 어떤 데이터 형식을 저장할 지 선언 
		int a; 
		a = 10;
		
				System.out.println(a);
				a = 20;
				System.out.println(a);
				
					// a=10.5; 실수는 담을 수 없다.
		
				float b; //float 실수를 저장할 수 있는 변수
				b = 10; //정수가 실수로 변환
				System.out.println(b);
				
				double c ; //double 실수 저장 변수
				c = 10.5; 
				System.out.println(c);
	
	}

}
