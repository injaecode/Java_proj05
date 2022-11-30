package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		try{
			System.out.println(3/0);
			int[]arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch(ArithmeticException e) {
			System.out.println("숫자 0은 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과합니다.");
		}catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
			System.out.println("=============");
		}
		
		try {
			System.out.println(3/0);
			int[]arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");

		}catch(ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e) {
			System.out.println("예외가 발생해 값이 출력되지 않습니다.");
			System.out.println(e.getMessage());//예외의 간단한 정보 출력
			e.printStackTrace()	;//예외의 세부적인 정보 출력
		}finally {
			System.out.println("프로그램 종료");
		}
		
	}

}
