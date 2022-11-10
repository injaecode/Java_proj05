package chapter03.ex03;

public class RelationOperator {
	public static void main(String[] args) {
		
	//크기 비교 연산자 vs. 등가 비교 연산자
	
	// 1. 크기 비교 연산자 (<, >, <=, >=) true / false
	System.out.println(5>2) ; //true
	System.out.println(5<=5); //true
	
	// 2. 등가 비교 연산자 (==, !=) true / false
		//값이 같은지 다른지를 비교하는 연산자
		//stack 메모리 값을 비교 
	
	int a = 5;
	int b = 2; 
	int c = 5;
	
	System.out.println(a == b); //false
	System.out.println(b != c); //true
			 
		//참조 자료형일 때 (Heap영역에 값이 저장, stack 영역에는 Heap에 번지수가 들어있다.)
	String str1 = new String ("안녕") ;
	String str2 = new String ("안녕") ;
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str1 == str2);//false
	
	//참조 영역(Heap)에서 값을 비교할 때는 .equals()를 사용해 값을 비교
	// 객체변수1.equals(객체변수2) : heap 영역의 값을 비교
	System.out.println(str1.equals(str2)); //true
	
	}
		
}
