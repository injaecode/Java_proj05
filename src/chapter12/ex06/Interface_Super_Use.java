package chapter12.ex06;


interface A{
	//기존의 와이파이 기능 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨
		//2022년에 새로운 기능 추가
		//default메소드 : 인터페이스 내에서 구현부가 있는 메소드
			//모든 자식 클래스에서 상속되어 내려감. 새로은 기능을 추가할 때 자식클래스에서 오류 없이 기능 추가 가능
		default void cde() {		//public
			System.out.println("블루투스 기능 추가");
		};
		//추상메소드 : public abstract가 생략됨 <- 실행부가 없는 메소드 {}
			//자식 클래스에서 반드시 구현해야 함
		void abc();//2000년에 구현된 메소드
		void bcd();//2005년에 구현된 메소드
	}
class B implements A {	//extends Object가 생략되어 있다.
	@Override
	public void abc() {
		System.out.println("와이파이 기능 1");
	}
	@Override
	public void bcd() {
		System.out.println("와이파이 기능 2");
	}
	public void def() {	//자식 클래스에서 인터페이스의 메소드 호출 : 인터페이스명.super.메소드명	*<중요>
		A.super.cde();	//인터페이스 A의 cde()메소드 호출
//		super.cde();	//Object클래스의 cde()메소드 호출 :오류
	}
}
public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식클래스에서 인터페이스에 구현된 default메소드 호출시

		//1. 객체 생성 
		A a1 = new B();
		a1.abc();	//A인터페이스에 존재		//B()에서 오버라이딩됨
		a1.bcd();	//A인터페이스에 존재		//B()에서 오버라이딩됨
		a1.cde();	//A인터페이스에 존재		//default메소드
		
//		a1을 B타입으로 다운캐스팅 해야 def()메소드를 호출할 수 있다
		B b1 = (B) a1;
		b1.abc();
	}

}
