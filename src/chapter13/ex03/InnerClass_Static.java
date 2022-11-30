package chapter13.ex03;

/*
 static Inner Class : 외부 클래스에서 인스턴스 필드와 메소드는 static inner class블락에 올 수 없음
 	//외부 클래스의 정적 필드와 메소드만 static Inner Class블락에 올 수 있음

	인스턴스 필드 및 메소드는 객체 생성 후 사용 가능
	정적 필드 및 메소드는 객체 생성 없이 사용 가능. 객체 생성 이후에도 사용 가능
*/
class A {	//outer class
	//외부 클래스에서 필드선언
	int a= 3;		//인스턴스필드
	static int b= 4; //정적필드
	
	//외부클래스에서 메소드 선언
	void method1() {	//인스턴스 메소드
		System.out.println("instance method");
	}
	static void method2 () {	//정적 메소드
		System.out.println("static method");
	}
	
	static class B {	//static inner class : static 필드 및 메소드만 포함할 수 있다.
		void bcd() {
//			1. 외부 클래스의 인스턴스 필드 및 메소드 :접근 불가
			//System.out.println(a); 접근불가
			System.out.println(b);
			
			//method1(); //인스턴스 메소드 접근불가
			method2();
	}
}
}
public class InnerClass_Static {

	public static void main(String[] args) {
		//static inner class의 객체 생성 : 외부 클래스를 생성하지 않고 바로 생성 가능
		
		//1. 
		A.B b = new A.B();
		b.bcd();
		
	}

}
