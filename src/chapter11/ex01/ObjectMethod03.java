package chapter11.ex01;

import java.util.HashMap;

class A {	//equals() 메소드만 재정의된 상태, hashcode()는 재정의 되지 않음
	//필드
	String name;
	//생성자
	A(String name) {
		this.name = name;
	}
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
}	
class B { // equals(), hashcode() 재정의	
	//필드
	String name;
	// 생성자
	B(String name) {
		this.name = name;
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B) obj).name) {
			return true;
		} else {
			return false;
		}

		}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
}

public class ObjectMethod03 {

	public static void main(String[] args) {
		// HashMap : Key : Value <=컬렉션
			//Key는 중복 데이터를 기입할 수 없는 자료 구조
			//equals(), hashCode(); 
		HashMap <Integer, String> hm1=new HashMap<>();
		hm1.put(1,"데이터1");
		hm1.put(2,"데이터2");
		hm1.put(2,"데이터3");
		
		System.out.println(hm1);
		
		//Integer : equals(), hashCode()메소드가 재정의 되어 있어 Map자료 구조에 Key로 사용 가능
		
		//자신이 만든 객체를 Map에 Key로 사용할 수 있음
		//equals(), hashCode()를 재정의해야 Map에 Key로 사용할 수 있다.
		System.out.println("=============");
		//A클래스는 equals() 재정의 hashCode() 재정의x <=Map의 Key로 사용할 수 없다.
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2);
		
		System.out.println("=============");
		//B클래스 : equals(), hashCoder()재정의 <= Map자료 구조의 Key로 사용 가능
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("첫번째"), "데이터4");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);
	}

}

