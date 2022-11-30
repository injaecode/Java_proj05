package chapter13.ex01;

/*
 	이너클래스 (Inner class) : 클래스 내부의 클래스
 		1. 인스턴스 이너 클래스 : static 키가 붙지 않는 내부 클래스
 	 		//외부 클래스의 객체를 먼저 생성한 후에 사용 가능
 	 	2. 정적(static) 이너클래스 : static키가 붙어있는 내부 클래스
 	 	3. 지역 이너클래스 : 메소드 내부에 선언된 이너 클래스
 	 
 	 * 이너클래스 특징 : - Outer Class의 접근제어자 제한 없이 모두 접근 가능 (필드, 메소드)
 	 				 - 다른 객체를 생성하지 않고 내부에 객체를 만들어 빠르게 사용 가능
 	 				 - 클래스의 필드와 메소드는 객체화해야 사용 가능함
 */
class A {	//outer class : 필드와 메소드에 접근제어자 장착
						//inner class를 생성하면 Outer class의 접근 제어자 무관 접근 가능
	
	public int a=3;		//같은, 다른 패키지 모두 접근 가능
	protected int b = 4;//같은, (상속)다른 패키지에서 접근 가능
	int c = 5;			//default : 다른 패키지 접근 불가
	private int d = 6;	//같은 클래스에서만 접근
	
	void abc() {
		System.out.println("A클래스의 메소드 abc()입니다.");
	}
	//이너클래스 : 인스턴스 이너클래스
		//아우터클래스의 접근제어자와 상관없이 접근
		// 기능 구현을 외부의 객체 생성 없이 내부에서 바로 처리

	//class B내부에 outer class의 필드와 메소드를 활용해 기능을 구현
	class B{
		void bcd() {
			//outer class의 필드 접근 : 접근제어자와 상관 없이 모든 필드 접근
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//outer class의 모든 메소드 접근 가능 : 접근 제어자 상관없이 접근
		}
	}


}
public class InnerClass01 {

	public static void main(String[] args) {
		//이너 클래스를 사용하기 위해서는 outer class의 객체를 먼저 생성해야 한다.
		A a = new A();	
		
		//내부 클래스의 객체 생성
		A.B b = a.new B();	//A.B: 외부클래스.내부클래스: 내부 클래스의 타입
							//b : 참조변수
							//a.new B(); <-외부인스턴스명.new 내부클래스생성자 호출
		b.bcd();
	}
}
