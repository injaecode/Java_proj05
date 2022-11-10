package chapter02.ex05;

public abstract class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (캐스팅)
		//1. 할당 값 앞 ()캐스팅 
		int value1 = (int) 5.3; //정수 값만 넣을 수 있다.
		long value2 = (long) 10.0000344 ;
			//실수의 기본은 double
		float value3 = (float)5.8 ; //캐스팅이 필요
		double value4 = (double)10.50 ; 
		System.out.println(value1); //5
		System.out.println(value2); //10
		System.out.println(value3); //5.8
		System.out.println(value4); //10.5
		
		//2. 캐스팅 할당값 뒤에 l, L / f, F : long, float
			//long, float의 정의된 변수에 값을 할당할 때 캐스팅해서 넣어야 한다.
			//정수 : int, 실수: double
		long value5 = 10L ;
		long value6 = 20l ; 
		float value7 = 5.8f ;
		float value8 = 5.8F ;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
			//정수의 기본은 int형으로 저장됨
		
	}

}
