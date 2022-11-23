package chapter07.ex05;

class A{
	//필드 : Heap영역에 저장
	int m ; 
	int n ; 
	
	//메소드 : 정수값 2개를 받음, this키를 생략한 경우
	void init (int a, int b) {	//메소드 내 a, b, c <-지역변수 : stack저장
		int c ; 
		c = 3;
		m=a; //this.m : 인풋 매개변수, 실행블락에 매개변수를 받는 변수, 필드의 변수
		n=b; //this.n
	}
	
	//this 키를 명시해야 하는 경우
	void init2 (int m, int n) {
		this.m = m ;
		this.n = n ;
	}
	
	//메소드
	void work() {
		this.init(2, 3);
		System.out.println(m + " " + n);
	}
}
public class This_Keyword {

	public static void main(String[] args) {
			// this : 자기 자신 객체의 필드나 메소드,   <== 필드, 메소드에 적용
			// this() : 자신객체의 다른 생성자 호출시 사용
			// super  : 상속에서 부모의 객체의 필드나, 메소드를 사용.  
			// super() : 부모클래스의 생성자 호출 할때 사용 

			A a = new A () ; 
			a.work();
	}

}
