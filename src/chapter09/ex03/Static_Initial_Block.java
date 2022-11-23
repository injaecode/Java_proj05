package chapter09.ex03;
class D {
	int a;		//인스턴스 필드  : 객체 생성시 초기값 할당, 생성자
	static int b; //static(정적) 필드, {정적 필드의 초기값 할당}
	
	static { 	//클래스가 JVM에 로드될 때 작동, 객체 생성 전에 작동 <-생성자와 같은 역할
		b = 5;
		System.out.println("클래스A가 JVM에 로딩되었습니다.");
	}
	
	D() {
		a = 10;
	}	
}
public class Static_Initial_Block {

	public static void main(String[] args) {
		// Static 필드의 초기값 세팅 : static {초기값 할당} <- 객체 생성 이전 로드
		// 인스턴스 필드의 초기값 세팅 : 객체 생성 1. 생성자 2. setter사용해 할당

		//객체 없이 호출 (정적 필드 호출)
		System.out.println(D.b);
		
		//객체 생성 후 호출 : a
		D d1 = new D();
		System.out.println(d1.a);
	}

}
