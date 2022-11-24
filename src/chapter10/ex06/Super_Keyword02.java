package chapter10.ex06;

class Aa {
	void abc() {
		System.out.println("Aa클래스의 abc()");
	}
	void ab() {
		System.out.println("Aa클래스의 ab()");
	}
}

class Bb extends Aa{
	@Override
	void abc() {
		System.out.println("Bb클래스의 abc()");
	}
	void bcd() {
		abc();			//this.abc()  //본인 클래스의 abc()
	}
	void cde() {
		super.abc();	//부모클래스의 abc()
	}	
	void def() {
		super.ab();
	}
}

public class Super_Keyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체 생성
		Bb bb = new Bb();
			//Aa, Bb 내포, 두 곳 필드 메소드 모두 소환 가능
		
		//2. 메소드 호출
		bb.abc();
		bb.bcd();
		bb.cde();
	}

}
