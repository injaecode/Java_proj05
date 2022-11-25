package chapter10.ex10;

class Aa {	//equals()가 정의되어 있지 않는 클래스
			//Object클래스의 equls()메소드는 stack의 참조주소를 비교하도록 되어있다.
	// 필드
	String name;

	// 생성자
	Aa(String name) {
		this.name = name;

	}
}

class Bb{
	//필드
	String name;
	Bb(String name){
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {		//object타입으로 업캐스팅해서 들어옴
		if (this.name == ((Bb)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}



public class Object_Method02 {

	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 : 기본적으로 == 참조 주소 비교
		// 객체의 Heap의 값을 비교하는 것이 아니라 Stack메모리의 참조 주소 값을 비교
		// String 클래스는 equals()메소드가 재정의 되어 있어 Heap의 값을 비교하도록 설정 되어있음.

		String s1 = new String("안녕");
		String s2 = new String("안녕");
		// == : 참조자료형에서는 Stack영역의 참조 주소를 비교
		// equals() : ==
		// String 클래스는 equals()메소드가 재정의 : Heap의 값을 비교하도록 설정
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// String 클래스는 Object의 equals() 재정의 되어있다.
		
		System.out.println("===============");
		Aa a1 = new Aa("안녕") ;
		Aa a2 = new Aa("안녕") ;
		System.out.println(a1 == a2);  //stack 참조 주소 비교, false
		System.out.println(a1.equals(a2)); //stack 참조 주소 비교, false

		System.out.println("===============");
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		
		System.out.println(b1 == b2);  //stack 참조 주소 비교, false
			//equals()메소드를 재정의해서 Heap값을 비교하도록 설정
		System.out.println(b1.equals(b2)); //Heap, name필드의 값을 비교하도록 재정의
			//true
	}

}
