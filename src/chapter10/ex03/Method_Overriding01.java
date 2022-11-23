package chapter10.ex03;
class A {
	void print () { //인스턴스 메소드 : 메소드 오버라이딩이 가능하다.
		System.out.println("A클래스의 print()");
	}
}
class B extends A{	//자식클래스 (child class)
	@Override	//어노테이션, 부모의 메소드를 재정의 하는 경우 오류를 방지하는 어노테이션
	void print() {
		System.out.println("B클래스의 print()");
	}
}
public class Method_Overriding01 {

	public static void main(String[] args) {
		/*
		 * 	Method Overloading : 동일한 이름의 메소드를 시그니쳐에 따라 다르게 식별 (메소드, 생성자)
		 * 											시그니쳐 : 매개변수의 개수, 타입
		 * 	Method Overriding : 부모클래스의 매소드를 자식클래스에서 재정의해서 사용하는 것
		 * 		<인스턴스 메소드>
		 */
		
		//1. A타입 / A생성자 호출
		A aa = new A();
		aa.print();						//A클래스 print()
		
		//2. B타입 / B생성자 호출
		B bb = new B();
		bb.print();						//B클래스 print()
		
		//3. A타입 / B생성자 호출		
		A ab = new B();
		ab.print();						//B클래스 print()
				
	}

}
