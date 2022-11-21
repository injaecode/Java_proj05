package chapter07;

class Calc{
	
	int add (int a, int b) {
		return a+b;
	}
	
	int diff (int a, int b) {
		return a-b ;
	}
	
	int mult (int a, int b){
		return a*b ;
	}
	
	double div(double a, double b) {
		return a/b ;
	}
	
	double rec(double a, double b) {
		return a*b ;
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc a = new Calc() ;
	
		
		int i = a.add(1, 2);
		System.out.println(i);
		
		int j = a.diff(7, 3);
		System.out.println(j);
		
		int k = a.mult(41, 78);
		System.out.println(k);
		
		double l = a.div(63, 2) ;
		System.out.println(l);
		
		double m = a.rec(24, 10);
		System.out.println(m);
		
		System.out.println(a.add(23, 2));
		System.out.println(a.diff(245, 92));
		System.out.println(a.mult(32, 93));
		System.out.println(a.div(201, 7));
		System.out.println(a.rec(20.3, 13.1));
		
	}

}
