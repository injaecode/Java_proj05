package chapter03.ex04;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자 vs 비트 연산자를 이용한 논리연산
			//1. 논리연산자 (and-&&, or-||, xor-^, not-!)
			//! 쇼트 서킷이 발생됨 :&&, || !
				//1-1. and (&&)
			System.out.println(true && true);  //true
			System.out.println(true && false); //false
			System.out.println(false && true); //false
			System.out.println(false && false);//false
				//1-2. or (||)
			System.out.println(true || true); //true
			System.out.println(true || false);//true
			System.out.println(false || true);//true
			System.out.println(false || false);//false
				//1-3. xor (^) : 두 값이 같을때 false, 다를때 true
			System.out.println(true ^ true); //false
			System.out.println(true ^ false);//true
			System.out.println(false ^ true);//true
			System.out.println(false ^ false);//false
			System.out.println(false ^ (5<2));//false
			System.out.println((10>20) ^ (30>20));//true
			
				//1-4. not (!) : 값이 true일 땐 false, false일 땐 true
			System.out.println(! true);
			System.out.println(! false);
			System.out.println(false || !(5<3));
			
			//2. 비트연산자로 논리 연산이 가능하다.
				// 쇼트 서킷이 발생하지 않도록 하기 위해 사용
				//and-&, or-|, xor-^, not-~
			System.out.println(true & true); //true
			System.out.println(true | false);//true
			System.out.println(true | (5<3));//true
			System.out.println(true ^ true); //false
			System.out.println(! true); //false
			//System.out.println(~ true); //오류 발생
			
			//3. 쇼트 서킷: 논리 연산자에서 앞의 내용으로 뒤의 값의 유무없이 식별 가능하면 뒤의 값은 처리하지 않음.
			System.out.println(true && true); //쇼트 서킷이 발생
			System.out.println(false && true); //쇼트 서킷이 발생
				//and 연산자에서는 처음 값이 false가 오게 되면 뒤의 값과 무관하게 false
			
			System.out.println(false || true); //쇼트 서킷이 발생하지 않음
			System.out.println(true || true); //쇼트 서킷이 발생
				//or 연산에서 처음 값이 true이면 쇼트서킷이 발생함
			
			int value1 = 3;
				System.out.println(false && ++value1 > 6); //쇼트서킷이 발생
				System.out.println(value1); //3
			
			int value2 = 3;
				System.out.println(false & ++value2 > 6); //쇼트서킷 발생하지 않음
				System.out.println(value2); //4
	
			int value3 = 3;
			System.out.println(true || ++value3 > 6); //쇼트서킷 발생
			System.out.println(value3); //3
			
			int value4 = 3;
			System.out.println(true | ++value3 > 6); //쇼트서킷 발생하지 않음
			System.out.println(value2); //4
			
			//xor (^) : 논리연산, 비트연산 <= 뒤의 값을 반드시 확인해야 하므로 쇼트서킷이 발생하지 않음
			
	
	}

}
