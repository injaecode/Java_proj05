package chapter10.ex05;

class Aaa {
	static void print() {
		System.out.println("Aaa 클래스의 static 메소드");
	}
}
class Bbb extends Aaa {
	static void print() {
		System.out.println("Bbb클래스의 static 메소드");
	}
}

public class Override_Static_Method {

	public static void main(String[] args) {
		// static method : 오버라이딩 불가
			//클래스 영역에 메소드가 저장되어 있음, 객체의 Heap주소(위치값)만 가진다.

		//1. 객체 생성 없이 클래스 이름으로 접근
		Aaa.print();
		Bbb.print();
		System.out.println("=============");
		
		//2. 객체 생성 후 출력
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		Aaa ab = new Bbb();
		
		a.print();
		b.print();
		ab.print();
	}

}
