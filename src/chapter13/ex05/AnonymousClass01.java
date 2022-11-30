package chapter13.ex05;

//인터페이스를 상속하는 이너클래스

interface C {
	void bcd();
	//	public abstract 생략됨

}
class A{
	//B를 객체화해서 C타입으로 선언
	C c = new B();
	
	//메소드
	void abc() {
		c.bcd();//C인터페이스의 bcd()호출, 구현한 클래스 B의 bcd()호출
	}
	//이너 클래스 : 인터페이스를 상속하는 이너클래스
	class B implements C{
	@Override
	public void bcd() {System.out.println("인스턴스 이너 클래스");		}	
	}
}
public class AnonymousClass01 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 메소드 호출
		A a = new A();
		a.abc(); 	//인터페이스를 구현한 클래스의 메소드 호출
	}

}


