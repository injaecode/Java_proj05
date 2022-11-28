package chapter12.ex01;
abstract class Calc3{
	abstract void add(int a, int b);
	abstract void min(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a, int b);
}
class Calc_Impl2 extends Calc3 {
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void min(int a, int b) {
		System.out.println(a-b);
	}
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a/b);
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Calc3 answer = new Calc_Impl2();
		answer.add(8, 3);
		answer.min(8, 3);
		answer.mul(8, 3);
		answer.div(8, 3);

	
		Calc3 answer2 = new Calc3() {
			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
			@Override
			void min(int a, int b) {
				System.out.println(a-b);
			}
			@Override
			void mul(int a, int b) {
				System.out.println(a*b);
			}
			@Override
			void div(int a, int b) {
				System.out.println((double)a/b);
			}
		};
		answer2.add(7, 6);
		answer2.min(7, 6);
		answer2.mul(7, 6);
		answer2.div(7, 6);
}
}