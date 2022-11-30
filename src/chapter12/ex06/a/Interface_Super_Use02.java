package chapter12.ex06.a;
//자식클래스에서 인터페이스의 메소드 호출:
	//default, static 메소드 호출 <=인터페이스 내에서 기능이 구현된 메소드
interface A {	//인터페이스 :추상메소드만 존재해야함(예외: default, static 메소드)
	default void abc() {
		System.out.println("A 인터페이스의 default 메소드");
	}
}
interface B{
	default void bcd() {
		System.out.println("B 인터페이스의 default 메소드");
	}
}
abstract class C{	//추상 클래스: 추상 메소드+일반 메소드+일반 필드
	C(){}	
	void cde() {
			System.out.println("추상 클래스의 일반 메소드");
		}
}
//class D는 C클래스를 상속하고, A와 B인터페이스를 구현하고 있다.
class D extends C implements A, B{
		//extends : 하나의 부모만 상속 가능
		//implements: 다중 상속 가능
	
	//부모의 메소드 호출
		//super : 부모 클래스의 메소드 호출
		//A.super: 부모 인터페이스의 메소드 호출
	void hij() {
		super.cde();	//C클래스의 cde()메소드 호출
	}
	void lmn() {
		A.super.abc();	//A인터페이스의 메소드 호출
		B.super.bcd();	//B인터페이스의 메소드 호출
	}
}
public class Interface_Super_Use02 {

	public static void main(String[] args) {
		// 객체 생성 후 확인
		D d1 = new D();
		d1.hij();	//클래스의 메소드 호출
		d1.lmn();	//인터페이스의 메소드 호출

	}

}
