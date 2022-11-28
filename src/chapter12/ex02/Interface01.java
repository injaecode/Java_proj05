package chapter12.ex02;

interface A {	//인터페이스 : 첫자는 반드시 영문 대문자
	//모든 필드는 (public static final)
	public static final int a = 3;
		//static : 객체 생성 없이 호출 가능
		//final : 상수 ( 값 수정 불가)
		
	//모든 메소드는 (public abstract)
	public abstract void abc();
}
//인터페이스에서 구현되지 않은 메소드를 구현한 클래스
class Aa implements A { //인터페이스를 구현한 클래스
	@Override
	public void abc() {
		System.out.println("A인터페이스를 구현한 메소드");
		
	}
	
}
//일반적인 표현, 축약표현 *<기본 사용>
interface B{
	int a= 5;
	void abc();	//모든 메소드는 구현부가 생략되어야 함( 예외_ default, static)
}
class Bb implements B{
	@Override
	public void abc() {	//반드시 public 기입
		System.out.println("B 인터페이스를 구현한 메소드");
	}
		
}
//추상 클래스 내에 추상 메소드 = abstract 생략 불가
abstract class C {
	int m = 4;		//일반 인스턴스 필드 : 수정 가능
	void bcd() {	//일반 메소드: 구현부가 있는 인스턴스메소드
		System.out.println("추상메소드 C 클래스의 메소드");
	}
	//추상 클래스 내에 추상 메소드
	abstract void abc();
}
class Cc extends C {
	@Override
	void abc() {
		System.out.println("추상클래스 C를 구현한 메소드");		
	}
	
	
}

public class Interface01 {	
	

	public static void main(String[] args) {
		/*
		 	인터페이스 (Interface): 내부와 외부를 연결 시켜주는 접점
		 	 	- 객체 생성이 불가함. 타입으로 지정은 가능
		 	 	- 모든 필드는 public static final이 생략됨
		 	 		: 값을 수정할 수 없다.
		 	 	- 모든 메소드는 public abstract가 생략됨
					: 모든 메소드는 선언부만 있어야 한다. 구현부{}가 있으면 안됨
					: 예외_default, static 메소드(1.8버전~)는 인터페이스에서 유일하게 구현부를 가지는 메소드
				- 하나의 클래스는 하나의 부모 클래스를 상속해야 함 (자바는 다중 상속 불가)
				- 하나의 클래스는 여러개의 인터페이스 다중 상속 가능
		 */

		//1. 인터페이스는 객체화할 수 없다. 구현되지 않는 메소드가 있기 때문에
		//A a = new A();
		//B b = new B();
		
		//2. 타입 지정 가능 *<중요>
		A a1 = new Aa(); //A = 인터페이스, Aa=인터페이스를 구현한 클래스
		a1.abc();
		B b1 = new Bb();
		b1.abc();
		
		System.out.println("========================");
		//3. 인터페이스의 필드는 public static final이 생략됨
			//static : 객체 생성 없이 호출 가능
			//final : 값 수정 불가
		System.out.println(A.a);	//인터페이스명.필드명
		System.out.println(B.a);	//인터페이스명.필드명
		
		//4. 필드의 값을 수정할 수 없다.
//		A.a=10;	//오류 발생 : final이 적용되어 값 수정 불가
//		B.a=20; //오류 발생 : final이 적용되어 값 수정 불가
		
		System.out.println("=========================");
		//1. 추상 클래스 : 객체 생성 불가
//		C c1 = new C();	//C가 추상클래스이므로 객체 생성 불가
		
		//2. 추상 클래스 : 구현한 클래스를 객체화해서 타입 지정 가능
		C c2 = new Cc();
		System.out.println(c2.m); 	//인스턴스 필드 : 객체 생성 후 호출 가능
//		System.out.println(C.m);	//인스턴스 필드 : 
		
		c2.m=44;
		System.out.println(c2.m);	//44 : 값 수정 가능
		c2.bcd();	//C클래스의 일반 메소드(인스턴스 메소드)
		c2.abc();	//오버라이딩된 메소드 출력, C타입의 abc()를 호출, Cc타입의 abc()
	}

}
