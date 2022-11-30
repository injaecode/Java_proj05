package chapter13.ex08;
interface Animal {
	void cry();
	void fly();	
}
//인터페이스를 사용해 4가지 형태로 출력
//1. Animal을 구현한 inner class 생성, 메서드 출력
class A {
	Animal anm = new B();
	void abc() {
		anm.cry();
		anm.fly();
	}
	class B implements Animal{
		@Override
		public void cry() {
			System.out.println("야옹1");			
		}
		@Override
		public void fly() {
			System.out.println("깡총1");
		}
	}
}
//2. Animal을 익명 class 생성, 메서드 출력
class B{
	Animal anm2 = new Animal() {
		public void cry() {System.out.println("야옹2");
		}
		public void fly() {System.out.println("깡총2");
		}
		};
		void bcd() {
		anm2.cry();
		anm2.fly();
		}
}
//3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성
class C{
	void cde(Animal anm3) {
		anm3.cry();
		anm3.fly();
	}
}
//4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력

public class Ex01 {

	public static void main(String[] args) {
		A a = new A();
		a.abc();
	System.out.println("============");
		B b = new B();
		b.bcd();
	System.out.println("============");
		C c = new C();
		Animal anm3 = new Animal() {
			@Override
			public void cry() {
				System.out.println("야옹3");
			}
			@Override
			public void fly() {
				System.out.println("깡총3");
			}
		};
		c.cde(anm3);
	System.out.println("============");	
		c.cde(new Animal() {
			@Override
			public void cry() {
				System.out.println("야옹4");
			}
			@Override
			public void fly() {
				System.out.println("깡총4");	
			}
		});
	}
}
