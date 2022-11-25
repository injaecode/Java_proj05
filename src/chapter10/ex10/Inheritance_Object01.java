package chapter10.ex10;

//java.lang 패키지의 모든 클래스는 import 없이 사용 가능
class A extends Object {			//extends Object가 생략되어 있다.
					//object클래스의 모든 메소드를 상속 받는다.
					//자식클래스는 하나의 부모만 상속할 수 있다.
					//java는 다중상속 불가, 인터페이스는 다중 implements가 가능함
	int m = 3;
	int n = 4;
	String name;

	//toString() : Object 클래스의 메소드
	//객체 출력시 toString()메소드가 작동되고, 기본적으로는 패키지.클래스@hashcode()
	//객체 자체를 출력시 객체의 필드 값을 출력하도록 재정의 해서 사용
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}

}
public class Inheritance_Object01 {

	public static void main(String[] args) {
		//
		A a = new A();
		//객체 자체를 출력시 object클래스의 toString()
		
		System.out.println(a); //출력문 : 패키지이름.클래스이름@hashcode()
		System.out.println(a.toString());				//hashcode = 참조주소 : 객체에 저장된 Heap 메모리의 주소 
		
		//String 클래스는 toString()이 재정의 됨
		String s1 = new String("안녕");
		System.out.println(s1);
	
	}

}
