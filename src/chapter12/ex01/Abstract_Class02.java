package chapter12.ex01;
//추상 메소드를 구현하는 방법 2가지
	//1. 자식 클래스에서 구현한 클래스를 생성하고 출력 : 자주 사용하는 경우
		//출력 : 코드가 간결하다. 구현한 클래스를 생성해야 한다.
	//2. 익명 클래스를 생성해 출력 : 1회 사용에 그치는 경우, 안드로이드 폰 개발 및 이벤트 처리 등
		//추상클래스의 구현한 자식 클래스 생성 없이 바로 사용 가능
		//여러번 사용할 때는 구현한 코드를 매번 생성해야 함
//1. 추상클래스(A)를 구현한 클래스(B)를 생성하여 출력
abstract class A{
	abstract void cry();
}
//2. 추상 클래스(A)를 구현한 클래스 없이 바로 출력
abstract class C {
	abstract void run();
}
//추상 클래스(A)의 구현 클래스
class B extends A {	//1. 자식 클래스에서 추상클래스의 메소드를 구현한 클래스를 생성하는 경우
	@Override
	void cry() {
		System.out.println("모든 동물은 웁니다.(자식 클래스에서 추상 메소드 완성)");
	}
}

public class Abstract_Class02 {

	public static void main(String[] args) {
	//추상 클래스는 객체화할 수 없다. 타입으로 지정만 가능
//		A a = new A(); 	//추상클래스: 객체 생성 불가능
		
		//첫번째 방법 : A(추상 클래스) <= B(구현 클래스)
		A a1 = new B();
		a1.cry();
		
		A a2 = new B();
		a2.cry();
		//두번째 방법 : 구현 클래스 없이 바로 출력(익명 클래스 사용), C: 추상 클래스이므로 객체화 불가능 
			//익명 클래스
		C c1 = new C() {
			//추상 클래스(C)에 오버라이딩하여, 구현되지 않은 메소드를 구현함
			@Override
			void run() {
				System.out.println("미완성 -> 완성");
			}
		};
		c1.run();
		
		C c2 = new C() {
			@Override 
			void run() {
				System.out.println("미완성2 -> 완성2");
			}
		};
		c2.run();
	}

}
