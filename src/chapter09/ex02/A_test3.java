package chapter09.ex02;

import chapter09.ex01.A;

public class A_test3 extends A {

		int k = a ; //public
		int l = b ; //protected
	//	int m = c ; //default 외부 패키지에서 접근 불가
	//	int n = d ; //private 외부 패키지에서 접근 불가
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_test3 a1 = new A_test3();
		System.out.println(a1.a);	//public
		System.out.println(a1.b);	//protected
	//	System.out.println(a1.c);	//default
	//	System.out.println(a1.d);	//private
	}

}
