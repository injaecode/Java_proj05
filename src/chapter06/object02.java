package chapter06;

//외부 클래스 : 객체를 생성하기 위한 설계도, 템플릿(틀)
class A {
	//필드(field) : 멤버 필드, 멤버 변수 : 클래스 블락에서 선언된 변수
	int m =3;
	int n =7;
	double d = 10.5;
	
	//생성자 : 필드의 내용을 초기화할 때(일반적으로) 객체를 생성할 때 생성자를 반드시 호출해야 한다.
	//	 	 리턴 타입이 존재하지 않음
	//		 메소드 이름이 클래스 이름과 동일함

	//기본 생성자 : 생략될 수 있다. 생성자도 하나의 메소드
	A() {
		//기본 생성자 : 인풋 매개 변수가 비어있는 생성자
	}
	
	//메소드 : 함수
	//리턴 타입 메소드명(인풋매개변수) {메소드 호출시 프로그램 실행코드}
		//void: 메소드 호출시 리턴을 돌려주지 않음을 의미
	void print() {
		System.out.println("print 메소드를 호출했습니다.");
	}


}
public class object02 {

	public static void main(String[] args) {
		// 변수[지역] : 메소드 내에서만 유지
		int b = 10 ;
		
		//자료형
		//클래스명 참조변수 = new A();
		// A : 클래스, 객체 자료형, 동일한 패키지 내에 클래스가 존재할 때 import 없이 사용 가능
		// a : 참조 변수 (Stack(주소) : Heap(필드, 메소드)
		//new : Heap공간에 필드와 메소드를 저장하라.
		//A() : A 클래스의 생성자 호출
		
		//1. 객체 생성 : A = class, a = object(객체)
		A a = new A();
		
		//2. 필드 출력
		System.out.println("==============a 객체의 필드 값을 출력 ===========");
		System.out.println(a.m);
		System.out.println(a.n);
		System.out.println(a.d);
		
		//3. 메소드 출력
		System.out.println("==============a 객체의 메소드 호출 ==============");
		a.print();

	System.out.println("=================================================");
	//하나의 클래스를 생성하면 크래스를 기준으로 여러 개의 객체를 생성할 수 있다.
	
	//A클래스를 기준으로 2번째 객체 생성
		//1. 객체 생성
		A aa = new A();
		
		//2. aa객체의 필드 호출
		System.out.println(aa.m);
		System.out.println(aa.n);
		System.out.println(aa.d);
	}

}
