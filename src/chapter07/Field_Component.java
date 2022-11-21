package chapter07;


class A { //A클래스 : 객체를 생성하기 위한 툴
	 
	//필드 : 객체 생성 시 Heap 영역에 필드 값 저장
		// Heap변수[필드]의 값이 비어있을 경우 강제 초기화
	int a ;
	boolean b ;
	double c ;
	String d ;
	
	//생성자 :a()[]
	
	//필드의 기본 값을 출력하는 메소드
	void defaultValue() {
		System.out.println(a); //0
		System.out.println(b); //false
		System.out.println(c); //0.0
		System.out.println(d); //null
	}
}

class B {
	//필드 선언
	int m =3;
	int n =4;
	//기본 생성자 생략됨 B() {}
	
	//메소드 선언
	void work1() {
		int k = 5; 				//지역변수 stack
		System.out.println(k);
		work2(3);				//메소드 호출 (work2(3))
	}
	
	void work2(int i) {
		int j = 4;				//지역변수
		System.out.println(i+j);
	}
}

public class Field_Component {

	public static void main(String[] args) {
		// 클래스 내부 구성요소
		// 	- field
		//	- method
		//	- constructor
		
		//메소드 내부에서 선언된 변수의 값은 Stack에 변수와 값이 저장됨
		int e; 	
		
		//1. 객체 생성
		A abc = new A();		// new A() : 기본 생성자 호출
		abc.defaultValue();		// 메소드 호출 
		
		System.out.println("================");
		A bcd = new A();
		bcd.defaultValue();
	
		System.out.println("================");
		B b = new B();
		b.work1();
	
	
	}

}
