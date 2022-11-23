package chapter09.ex03;

class C {
	int a = 10;				//인스턴스 필드 : 객체화해서 사용 가능, 다른 객체와는 공유되지 않는 값
									//메모리의 Heap 공간에 변수와 값을 저장
	static int b = 20 ;		//정적 필드 : 객체화하지 않고 사용 가능, 모든 객체에서 공유되는 변수
									//메모리의 클래스 영역에 변수의 값을 저장
									//Heap영역에는 클래스 영역의 저장된 주소 값만 가짐
	void print1() {
		System.out.println(a + " " + b);
	}
	static void print2() {	//정적 메소드에는 인스턴스 필드가 올 수 없다. a: 인스턴스 필드
							//정적메소드에서는 정적 필드만 올 수 있다.
		System.out.println(b);
	}
}


public class Instance_VS_Static02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		C c1 = new C();
		//객체 필드의 값 수정
		c1.a = 100 ;
		c1.b = 777;
		System.out.println(c1.a); 	//10 -> 100
		System.out.println(c1.b);	//20
		System.out.println("=========");
		C c2 = new C() ;
		System.out.println(c2.a);	//10 -> 100
		System.out.println(c2.b);	//20 -> 777
		System.out.println("=========");
		C c3 = new C();
		
		
		c1.a=888;
		c2.a=999;		//인스턴스필드-해당 객체에만 적용되는 고유한 값
		c3.a=777;
		c1.b=111;
		
		
		System.out.println(c1.a);
		System.out.println(c2.a);
		System.out.println(c3.a);
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
	}

}
