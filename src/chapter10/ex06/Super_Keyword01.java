package chapter10.ex06;

class A {
	int a; 
	A() {} //**상속 관계에서는 기본생성자 명시되어야만 자식생성자에서 오류 발생되는 것 예방
	//부모 클래스의 생성자가 존재
	A (int a) {
		this.a = a;
	}
}
class B extends A{	//기본적으로 super()가 생략되어 있음
					//첫라인에 
	//B () {super();}
	B() {
		super();
	}
}
public class Super_Keyword01 {

	public static void main(String[] args) {
		/*
		  this keyword : 자신의 객체의 필드와 메소드
		  this () 		: 생성자의 첫 라인에 위치, 자신의 객체에서 다른 생성자를 호출할 때 사용
		  
		  super keyword : 부모 객체의 필드와 메소드
		  super()		 : 생성자의 첫 라인에서 부모 객체 생성자를 호출
		  
		 * 모든 자식 클래스의 생성자는 반드시 첫라인에 this(), super() 배치되어야 함
		 * 자식 클래스의 생성자는 기본적으로 super()가 생략되어 있음
		 * 자식 클래스는 기본적으로 부보의 기본생성자를 호출함
		 */
	}

}
