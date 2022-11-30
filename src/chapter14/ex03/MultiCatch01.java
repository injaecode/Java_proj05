package chapter14.ex03;

public class MultiCatch01 {

	public static void main(String[] args) {
		// 여러 예외가 동시에 발생된 경우 처리
//	
		//1. 두개의 Exception을 각각 try~catch로 처리
		try {
		System.out.println(3/0);	//실행 예외: ArithmeticException
		}catch(ArithmeticException e){
			System.out.println("숫자 0으로는 나눌 수 없습니다.");
		}finally {
			System.out.println("프로그램 실행 종료");
			System.out.println("==============");
		}
		
		try {
		int num = Integer.parseInt("10A");//실행 예외: NumberFormatException
		}catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 전환할 수 없습니다");
		}finally {
			System.out.println("두번째 프로그램 종료");
			System.out.println("================");
		}
		//2. 하나의 try~catch에서 한번에 처리
		try {
			System.out.println(3/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환이 불가합니다.");
		}finally {
			System.out.println("세번째 프로그램 종료");
		}
		System.out.println("============");
		//3. 하나의 try~catch에서 한번에 처리
		
		try{
			System.out.println(3/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {
			System.out.println("두개의 예외가 함께 발생했습니다.");
		}
	}

}
