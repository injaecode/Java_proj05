package chapter13.ex01;
class C {
	int a = 5;
	int b = 4;
	
	int add (int a, int b) {
		return a+b;
	}	
	int diff (int a, int b) {
		return a-b;
	}
	int mul (int a, int b) {
		return a*b;
	}
	double div (int a, int b) {
		return (double)a/b;
	}
class D{
	void abc() {
		System.out.println("두 수의 합은 : " + add(a,b));
		System.out.println("두 수의 뺄셈은 : " + diff(a,b));
		System.out.println("두 수의 곱셈은 : " + mul(a,b));
		System.out.println("두 수의 나눗셈은 : " + div(a,b));
	}
}
	
	
}
public class Ex01 {

	public static void main(String[] args) {
		// 1. 외부 객체 생성
		C c = new C();
		// 2. 내부 객체 생성
		C.D d = c.new D();
		
		d.abc();

	}

}
