package chapter13.ex05.a;

interface A{
	void cry();
	void fly();
}
class B{
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
	}
	//이너 클래스: 외부 파일에 별도 생성하지 않고 클래스 내부에 생성 후 바로 사용
	class C implements A{
		@Override
		public void cry() {
			System.out.println("내일은 날씨가 매우 춥대요");
			
		}
		@Override
		public void fly() {
			System.out.println("따뜻하게 챙겨 입어야 해요");
		}
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B cold = new B();
		cold.abc();
	}

}
