package chapter10.ex02;

//클래스의 상속관계에서 업캐스팅 및 다운 캐스팅
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class TypeCasting02 {

	public static void main(String[] args) {
		// 1. 업캐스팅(자동으로 변환): 생략시 컴파일러가 자동으로 추가, 자식 클래스 객체 생성 ->타입을 부모클래스로
		A ac = new C();
			//ac는 A, B, C를 모두 내포하고 A타입으로 정의됨
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);	//false

		System.out.println("=======================");
		//bc: 
		B bc = new C();
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);	//false
		
		//bc는 B타입으로 정의, A타입으로 업캐스팅
		A a = bc;
		
		//2. 다운캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않는다. 실행시 예외가 발생
		
		A aa = new A();
			// aa는 A만 내포하고 있음
			System.out.println(aa instanceof A);
			System.out.println(aa instanceof B);	//false
			System.out.println(aa instanceof C);	//false
			System.out.println(aa instanceof D);	//false
	
	//	B ba = (B)aa ;	//실행시 오류 발생
		if (aa instanceof B) {
			B ba = (B)aa;
		}else {
			System.out.println("aa는 B를 내포하지 않아 다운캐스팅이 불가합니다.");
		}
	
		System.out.println("==========================");
		B bd = new D();
			// A, B, D 내포, A, B 접근 가능
		System.out.println(bd instanceof A);
		System.out.println(bd instanceof B);
		System.out.println(bd instanceof C);	//false
		System.out.println(bd instanceof D);
	}
	
	

}
