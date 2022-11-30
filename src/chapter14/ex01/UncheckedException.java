package chapter14.ex01;

class Aa {}//부모클래스
class B extends Aa{}//자식클래스

public class UncheckedException {

	public static void main(String[] args) {
		// 실행예외: 컴파일 단계에서 체크하지 않고 실행 시 예외 발생
			//Unchecked Exception, RuntimeException
		
		//1. ArithmeticException: 정수를 0으로 나누었을때 발생하는 예외
			//모든 프로그램에서 숫자를 0으로 나누면 오류 발생
//		System.out.println(3/0);
		
		//2. ClassCastException: 다운캐스팅 타입이 존재하지 않는 경우
		Aa a = new Aa(); //부모클래스 객체화
//		B b = (B) a;	//a타입객체는 B타입을 포함하지 않는다(실행시 오류 발생)
		
		//3. ArrayIndexOutOfBoundException: 배열의 방번호를 초과했을 때 발생하는 예외
		int[] arr = new int[] {1,2,3};
//		System.out.println(arr[3]);
		
		//4. NumberFormatException : 문자 타입의 값을 정수(int)나 실수(double)로 변환 시 예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22!");
//		System.out.println(num2);
		
		//5. NullPointException : 참조주소 값이 null인데, 메소드를 호출하는 경우
//		String str = null;
//		System.out.println(str.charAt(2));	//문자열이 저장되는 경우
		
	}

}
