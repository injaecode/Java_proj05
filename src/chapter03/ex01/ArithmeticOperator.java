package chapter03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자와 세 가지 경우의 증감 연산자.
		// 1. 산술 연산자
		System.out.println(2+3); //5
		System.out.println(2+"3"); //23
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(8%5); // 3  //% : 나머지 값만 출력
		System.out.println(8%9); //8
		
		// 2. 증감 연산자 (case1)
		int value1 = 3;
		value1++; // ++ 1씩 증가 
		System.out.println(value1); //4
		
		int value2 = 3;
		++value2 ; 
		System.out.println(value2); //4
		
		// 3. 증감 연산자 (case2)
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3); //4
		System.out.println(value4); //3
		
		int value5 =3;
		int value6 = ++value5;
		System.out.println(value5); //4
		System.out.println(value6); //4
		
		// 4. 증감 연산자의 사용 (case3) !중요!
		int value7 = 3 ;
		int value8 = 4 ;
		int value9 = 2 + value7-- + ++value8 ;
		System.out.println(value7); 
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("=============");
		
		int value10 = 30;
		int value11 = 40;
		int value12 = 50;
		int value13 = 7 + --value10 + ++value11 + value12--;
		
		System.out.println(value10); //29
		System.out.println(value11); //41
		System.out.println(value12); //50
		System.out.println(value13); //127
				
		
		
	}

}
