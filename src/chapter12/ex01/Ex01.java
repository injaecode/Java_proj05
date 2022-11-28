package chapter12.ex01;
abstract class Calc {
	abstract int add(int a, int b);
	abstract int min(int a, int b);
	abstract int mul(int a, int b);
	abstract double div(int a, int b);
	
}
class Calc_Impl extends Calc { //Calc를 구현한 클래스
	int add(int a, int b) {
		return a+b;
	}
	int min(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}
abstract class Calc2 {
	abstract int add(int a, int b);
	abstract int min(int a, int b);
	abstract int mul(int a, int b);
	abstract double div(int a, int b);
	
}
public class Ex01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		
		// 1. 구현 클래스의 메소드 호출 후 출력
		Calc eql = new Calc_Impl() ;
		
		System.out.println(eql.add(7, 3));
		System.out.println(eql.min(a, b));
		System.out.println(eql.mul(7, 3));
		System.out.println(eql.div(7, 3));
		// 2. 익명 클래스로 메소드 호출 후 출력
		Calc2 eql2 = new Calc2() {
			@Override
			
			int add(int a, int b){
				return a+b;
			}
			@Override
			int min(int a, int b) {
				return a-b;
			}
			@Override
			int mul(int a, int b) {
				return a*b;
			}
			@Override
			double div(int a, int b) {
				return (double)a/b;
			}
		};
			System.out.println(eql2.add(a, b));
			System.out.println(eql2.min(a, b));
			System.out.println(eql2.mul(a, b));
			System.out.println(eql2.div(a, b));
			
		
			
	
	}

}
