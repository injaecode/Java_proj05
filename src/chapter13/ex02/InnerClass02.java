package chapter13.ex02;
//이너클래스에서 외부 클래스의 필드와 메소드 접근

//cf) 메소드 오버라이딩 - 반드시 상속 관계에만 적용
//					- <인스턴스메소드> 오버라이딩
//					- 인스턴스필드, 정적필드, 정적메소드는 오버라이딩되지 않는다.
class A {
	//필드
	int a = 3;
	int b = 4; 
	int c = 33;
	int d = 44;
	//메소드
	void abc() {	//오버라이딩 불가
		System.out.println("A클래스의 메소드 abc()");
	}
	void def() {
		System.out.println("중복메소드");
	}
	
	//이너클래스
	class B{
		//이너클래스 필드
		int a = 5;
		int b = 6;
		//이너클래스 메소드
		void abc() {	//오버라이딩 불가
			System.out.println("B클래스의 메소드 abc()");
		}
		void bcd() {
		//필드의 값 호출
		System.out.println(a);	//this.a	//5
		System.out.println(b);	//this.b	//6
		//이너클래스에서 아우터클래스 필드 호출
		System.out.println(A.this.a);	//outer class 필드 //3
		System.out.println(A.this.b);	//outer class 필드 //4
		
		//메소드 호출
		abc();			//this.abc() : 이너클래스의 메소드
		A.this.abc();	//아우터 클래스 메소드
		
		//이너클래스와 아우터클래스에서 중복되지 않는 필드 호출
		System.out.println("==========");
		System.out.println(c);
		System.out.println(d);
		
		//외부의 중복되지 않는 메소드
		def();
		}
	}
}
public class InnerClass02 {

	public static void main(String[] args) {
		//1. 외부 객체 생성
		A a = new A();
		
		//2. 내부 객체 생성
		A.B b = a.new B();
		b.bcd();
		
	}

}
