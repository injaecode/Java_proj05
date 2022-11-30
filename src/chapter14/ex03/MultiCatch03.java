package chapter14.ex03;

public class MultiCatch03 {

	public static void main(String[] args) {
	//Exception : 모든 예외의 부모 클래스, try블락의 모든 예외 처리
		//각 예외에 대한 세부적인 제어는 불가능
		
		/*
		try {
			System.out.println(3/0);
			int [] arr = new int[] {1,2,3};
			System.out.println(arr[4]);
			int num = Integer.parseInt("20A");	
	
		}catch(Exception e) {
			//모든 예외를 Exception에서 받아서 처리
		}catch(ArithmeticException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(NumberFormatException e) {
			
		}
		*/
		try {
			System.out.println(3/0);
			int [] arr = new int[] {1,2,3};
			System.out.println(arr[4]);
			int num = Integer.parseInt("20A");	
	
		
		}catch(ArithmeticException e) {
			//try블락 예외 세부 처리
		}catch(ArrayIndexOutOfBoundsException e) {
			//try블락 예외 세부 처리
		}catch(NumberFormatException e) {
			//try블락 예외 세부 처리
		}catch(Exception e) { //<=세부적인 예외 처리 후 마지막에 위치해야 함
			//그 외에 모든 예외를 Exception에서 받아서 처리
		}
	}
}
