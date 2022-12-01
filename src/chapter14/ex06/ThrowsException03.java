package chapter14.ex06;

class Aaaa{
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
		}
	void cde() throws ClassNotFoundException {
	//해당 클래스에 클래스가 존재하지 않음. 일반 예외
		Class cls2 = Class.forName("java.lang.Object2"); 
	}
}
public class ThrowsException03 {

	public static void main(String[] args)   {
		Aaaa a1 = new Aaaa();
		try {
			a1.abc();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
