package chapter14.ex06;
//1. 예외가 발생할 떄 각 메소드 내부에서 예외를 직접 처리함
class Aa{
	void abc() { //bcd()메소드 호출
		bcd();
	}
	void bcd() {
		try {
		System.out.println(3/0);
		int[]arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException |InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class Bb{
	void abc() {
	try {
		bcd();
	} catch (Exception e) {
		e.printStackTrace();
	}}
	void bcd() throws Exception {
		System.out.println(3/0);
		int[]arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa x = new Aa();
		x.abc();
		x.bcd();
	}

}
