package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수 이름 지정하기
		// 변수명은 소문자로 시작(권고), 한글 사용 가능(권고안함) 
		// cf) 클래스 이름은 대문자로 시작(필수)
		// 변수명으로 숫자 사용 가능하나 첫 자리엔 사용불가
		// 변수명으로 자바에서 사용하는 예약어는 사용할 수 없다 (package, class, public ...)
		// 자료형 변수명
		boolean aBcD; //true, false에 넣을 수 있다.
		aBcD = true ;
		aBcD = false ;
	  //aBcD = 10 //오류발생
		byte 가나다라 ; //1byte의 데이터만 저장
		short $_abcd ; // 특수문자 _ $로 사용 제한
	 //boolean %abcd ; 오류발생
	 //char 3abcd ; 오류발생
		char a3cd ;
		long abcd3 ;
	 // double private ; 오류발생 (자바에서 사용하는 예약어)
	 //	int my work ; 변수명에 공백 사용 불가
		String myClassName ; //이어서 여러 단어 적용할 때 단어 앞 대문자 적용(권장)
	
		// 상수 : 값을 넣으면 그 값을 변화하지 못하도록 설정
		// 변수 자료형 앞에 final 키가 붙으면 상수
		// 상수명은 전체를 대문자 지정 (권장)
		double PI = 3.141592 ; //변수 : PI값 변화 가능
		System.out.println(PI); //3.141592
		PI = 123.456 ; 
		System.out.println(PI); //123.456
		
		final double PI2 = 3.141592 ; // 상수 : 값을 넣으면 수정할 수 없다.
		System.out.println(PI2);
	 // PI2 = 123.456 ; 상수이므로 다른 값 대입 불가
		final int MY_DATA = 10 ;
		final float my_data ; //권고사항 위배
			
		
	
	}

}
