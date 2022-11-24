package chapter10.ex08;

class A {
	A(){
		this(3);//자신 객체의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}
class B extends A{		//자식 클래스는 생성자 첫라인에 super()나 this()가 기입되어야 함 (없는 경우 super()가 생략된 것)
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
		System.out.println("B 생성자 2");
	}
}
public class Super_Method03 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 출력
		A aa1 = new A();	//A 생성자 2 , A 생성자 1
		System.out.println("===========");
		
		// 2. 
		A aa2 = new A(3); 	//A 생성자 2
		System.out.println("===========");
		
		// 3. B생성자 호출		//A 생성자 2, A 생성자 1, B 생성자 2, B 생성자 1 
		B bb1 = new B();
		System.out.println("===========");
		
		// 4.
		B bb2 = new B(3);	//A 생성자 2, A 생성자 1, B 생성자 2
	}

}
