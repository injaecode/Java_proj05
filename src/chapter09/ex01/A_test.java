package chapter09.ex01;

public class A_test {

	public static void main(String[] args) {
		// A클래스와 동일한 패키지 내에서 존재하는 클래스
		A a1 = new A();
		System.out.println(a1.a);	//public
		System.out.println(a1.b);	//protected
		System.out.println(a1.c);	//default
	//	System.out.println(a1.d);	//private : 같은 파일 내에서만 수정 가능
		
		
		a1.abc();
		a1.bcd();
		a1.cde();
	//	a1.def();
	}

}
