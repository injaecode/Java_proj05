package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		try {
			//실행시 예외 발생:ArrayIndexOutOfBoundsException
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 초과했습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
		
	}

}
