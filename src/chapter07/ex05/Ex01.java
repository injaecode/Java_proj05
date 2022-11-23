package chapter07.ex05;

class Student{  
	//필드 선언 
	String stuName ; 		//학생이름 : 학생이름없음
	int stuNo; 				//학번    :  0
	String stuPhone; 		//핸드폰번호 : 000-0000-0000 
	String stuAddr;			// 주소     : "서울"
	int stuAge; 			// 나이     : 0
	double stuWeight; 		// 몸무게    : 0.0
	
	Student() {   //기본생성자에서 초기값을 할당 : this () 메소드를 사용해서 각 필드의 값을 적용
		stuName = "이름없음";
		stuNo = 0; 
		stuPhone = "000-0000-0000"; 
		stuAddr = "서울"; 
		stuAge = 0; 
		stuWeight = 0.0; 
	}
public class Ex01 {


	}


}